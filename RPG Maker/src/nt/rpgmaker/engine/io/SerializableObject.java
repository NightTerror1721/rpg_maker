/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.rpgmaker.engine.io;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public interface SerializableObject
{
    void serialize(Serializer s) throws IOException;
    void unserialize(Unserializer us) throws IOException;
}
