package com.example.petclinic.services.mapservice;

import com.example.petclinic.model.Vet;
import com.example.petclinic.services.VetService;

import java.util.Set;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.services.mapservice
 * Project Name: pet-clinic
 * Date: 19-07-2022
 */

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public Vet delete(Vet object) {
        return super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
