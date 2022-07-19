package com.example.petclinic.services.mapservice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.services.mapservice
 * Project Name: pet-clinic
 * Date: 18-07-2022
 */

public abstract class AbstractMapService<T, ID> {
    private final Map<ID, T> map = new HashMap<>();

    protected Set<T> findAll(){
        return (Set<T>) this.map.values();
    }

    protected T findById(ID id){
        return map.get(id);
    }

    protected T save(ID id, T object){
        return map.put(id, object);
    }

    protected T delete(T object){
        boolean isDeleted = map.entrySet().removeIf(entry -> entry.equals(object));
        return isDeleted ? object : null ;
    }

    protected T deleteById(ID id){
        return map.remove(id);
    }
}
