package com.example.petclinic.services.mapservice;

import com.example.petclinic.model.Pet;
import com.example.petclinic.services.PetService;

import java.util.Set;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.services.mapservice
 * Project Name: pet-clinic
 * Date: 19-07-2022
 */

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet delete(Pet object) {
        return super.delete(object);
    }

    @Override
    public Pet deleteById(Long id) {
        return super.deleteById(id);
    }
}
