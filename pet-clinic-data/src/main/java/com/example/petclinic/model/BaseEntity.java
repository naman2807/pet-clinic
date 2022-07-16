package com.example.petclinic.model;

import java.io.Serializable;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.model
 * Project Name: pet-clinic
 * Date: 16-07-2022
 */

public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
