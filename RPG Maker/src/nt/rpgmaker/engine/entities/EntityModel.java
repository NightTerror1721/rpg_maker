/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.rpgmaker.engine.entities;

/**
 *
 * @author Asus
 */
public abstract class EntityModel
{
    private final String name;
    
    protected EntityModel(final String name)
    {
        if(name == null)
            throw new NullPointerException();
        if(name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }
    
    public final String getName() { return name; }
    
    public final <E extends Entity> E createEntity()
    {
        E e = (E) newEntityInstance();
        e.model = this;
        return e;
    }
    protected abstract Entity newEntityInstance();
}
