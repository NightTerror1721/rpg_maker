/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.rpgmaker.engine.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class Unserializer extends DataInputStream
{
    public Unserializer(InputStream in)
    {
        super(in);
    }
    
    public final <SO extends SerializableObject> SO readSerializableObject() throws IOException
    {
        String className = readUTF();
        SO obj = createSerializableObject(className);
        obj.unserialize(this);
        return obj;
    }
    
    
    
    
    
    private static final class SerializableObjectInfo
    {
        private final Constructor<? extends SerializableObject> cns;
        
        private SerializableObjectInfo(String className) throws Exception
        {
            try
            {
                Class<? extends SerializableObject> cl = (Class<? extends SerializableObject>) Class.forName(className);
                cns = cl.getConstructor();
            }
            catch(NoSuchMethodException | SecurityException | ClassCastException ex)
            {
                throw new Exception(ex);
            }
        }
        
        public final <O extends SerializableObject> O create() throws Exception
        {
            try
            {
                return (O) cns.newInstance();
            }
            catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex)
            {
                throw new Exception(ex);
            }
        }
    }
    
    private static final HashMap<String, SerializableObjectInfo> SO_INFO = new HashMap<>();
    
    private static <O extends SerializableObject> O createSerializableObject(String className) throws IOException
    {
        SerializableObjectInfo info = SO_INFO.get(className);
        try
        {
            if(info == null)
            {
                info = new SerializableObjectInfo(className);
                SO_INFO.put(className, info);
            }
            return info.create();
        }
        catch(Exception ex)
        {
            throw new IOException(ex.getCause());
        }
    }
}
