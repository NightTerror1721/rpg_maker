/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.rpgmaker.engine.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Asus
 */
public final class EntityModelManager
{
    private EntityModelManager() {}
    
    private static final HashMap<String, EntityModel> MODELS = new HashMap<>();
    
    public static final void registerModel(EntityModel model)
    {
        if(model == null)
            throw new NullPointerException();
        String name = model.getName();
        if(MODELS.containsKey(name))
            throw new IllegalArgumentException("EntityModelIdentifier with name: \"" + name + "\" has already exists");
        MODELS.put(name, model);
    }
    
    public static final EntityModel getModel(String modelName)
    {
        EntityModel model = MODELS.get(modelName);
        if(model == null)
            throw new IllegalArgumentException("Model \"" + modelName + "\" does not exists");
        return model;
    }
    
    public static final <E extends Entity> E createEntity(String model)
    {
        return getModel(model).createEntity();
    }
    
    public final List<EntityModel> getAllModels()
    {
        return new ArrayList<>(MODELS.values());
    }
}
