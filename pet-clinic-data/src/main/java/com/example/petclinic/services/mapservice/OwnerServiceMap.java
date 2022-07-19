package com.example.petclinic.services.mapservice;

import com.example.petclinic.model.Owner;
import com.example.petclinic.services.OwnerService;

import java.util.Set;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.services.mapservice
 * Project Name: pet-clinic
 * Date: 18-07-2022
 */

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public Owner delete(Owner object) {
        return super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastname(String lastname) {
        return null;
    }
}
