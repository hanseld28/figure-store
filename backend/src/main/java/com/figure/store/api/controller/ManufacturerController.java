package com.figure.store.api.controller;

import com.figure.store.domain.model.product.Manufacturer;
import com.figure.store.domain.service.product.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/manufacturers")
public class ManufacturerController {

    private ManufacturerService manufacturerService;

    @Autowired
    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @PostMapping
    public Manufacturer save(@Valid @RequestBody Manufacturer manufacturer) {
        return manufacturerService.save(manufacturer);
    }
}
