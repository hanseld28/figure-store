package com.figure.store.domain.service.product;

import com.figure.store.domain.exception.DomainException;
import com.figure.store.domain.exception.EntityNotFoundException;
import com.figure.store.domain.model.product.Category;
import com.figure.store.domain.repository.product.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * author LucasDonizeti
 */
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category) {
        Optional<Category> existCategory = categoryRepository.existsByName(category.getName());

        if (existCategory.isPresent())
            throw new DomainException("Já existe uma categoria cadastrada com esse nome.");

        return categoryRepository.save(category);
    }

    public List<Category> get() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        if (!categoryRepository.findById(id).isPresent())
            throw new EntityNotFoundException("Categoria não encontrada");
        return categoryRepository.findById(id).get();
    }

}
