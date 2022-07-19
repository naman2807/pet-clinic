package com.example.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: com.example.petclinic.controller
 * Project Name: pet-clinic
 * Date: 19-07-2022
 */

@Controller
@RequestMapping("/owner")
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getOwnersList(){
        return "owners/index";
    }
}
