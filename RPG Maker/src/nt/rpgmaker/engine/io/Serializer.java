/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.rpgmaker.engine.io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Asus
 */
public class Serializer extends DataOutputStream
{
    public Serializer(OutputStream out)
    {
        super(out);
    }
    
    public final void writeSerializableObject(SerializableObject so) throws IOException
    {
        Class<? extends SerializableObject> cl = so.getClass();
        writeUTF(cl.getName());
        so.serialize(this);
    }
}
