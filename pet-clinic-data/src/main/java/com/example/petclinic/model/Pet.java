package com.example.petclinic.model;

import java.time.LocalDate;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.model
 * Project Name: pet-clinic
 * Date: 15-07-2022
 */

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
