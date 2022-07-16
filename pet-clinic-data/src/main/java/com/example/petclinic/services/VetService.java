package com.example.petclinic.services;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;

import java.util.Set;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.services
 * Project Name: pet-clinic
 * Date: 16-07-2022
 */

public interface VetService {
    Vet findById(Long id);
    void save(Vet vet);
    Set<Vet> findAllVets();
}
