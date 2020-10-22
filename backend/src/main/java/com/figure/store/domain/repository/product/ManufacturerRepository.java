package com.figure.store.domain.repository.product;

import com.figure.store.domain.model.product.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

    Optional<Manufacturer> existsByName(String name);
}
