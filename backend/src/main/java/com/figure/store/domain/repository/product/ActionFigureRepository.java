package com.figure.store.domain.repository.product;

import com.figure.store.domain.model.product.ActionFigure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionFigureRepository extends JpaRepository<ActionFigure, Long> {
    Boolean existsByName(String name);
}
