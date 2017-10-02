/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.rpgmaker.engine.entities;

import java.util.UUID;

/**
 *
 * @author Asus
 */
public abstract class Entity
{
    private final UUID uid = UUID.randomUUID();
    EntityModel model;
    private String name;
    private String tag;
    
    public final UUID getUId() { return uid; }
    
    public final EntityModel getModel() { return model; }
    
    public final void setName(String name)
    {
        if(name == null)
            throw new NullPointerException();
        this.name = name;
    }
    public final String getName() { return name; }
    
    public final void setTag(String tag)
    {
        if(tag == null)
            throw new NullPointerException();
        this.tag = tag;
    }
    public final String getTag() { return tag; }
}
