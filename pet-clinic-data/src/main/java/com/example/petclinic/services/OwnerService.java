package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

import java.util.Set;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.services
 * Project Name: pet-clinic
 * Date: 16-07-2022
 */

public interface OwnerService {
    Owner findByLastname(String lastname);
    Owner findById(Long id);
    void save(Owner owner);
    Set<Owner> findAllOwners();
}
