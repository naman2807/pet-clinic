package com.example.petclinic.services;

import java.util.Set;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.services
 * Project Name: pet-clinic
 * Date: 18-07-2022
 */

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    T delete(T object);
    T deleteById(ID id);
}
