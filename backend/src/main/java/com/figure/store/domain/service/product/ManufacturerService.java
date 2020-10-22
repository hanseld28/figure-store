package com.figure.store.domain.service.product;

import com.figure.store.domain.exception.DomainException;
import com.figure.store.domain.model.product.Manufacturer;
import com.figure.store.domain.repository.product.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManufacturerService {

    private ManufacturerRepository manufacturerRepository;

    @Autowired
    public ManufacturerService(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    public Manufacturer save(Manufacturer manufacturer) {
        String manufacturerName = manufacturer.getName();
        Optional<Manufacturer> existingManufacturer = manufacturerRepository.existsByName(manufacturerName);

        if(existingManufacturer.isPresent() && !existingManufacturer.get().equals(manufacturer)) {
            throw new DomainException("Já existe um fabricante cadastrado com esse nome.");
        }

        Manufacturer savedManufacturer = manufacturerRepository.save(manufacturer);

        return savedManufacturer;
    }
}
