package com.figure.store.domain.service.product;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.figure.store.domain.model.product.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.figure.store.domain.exception.DomainException;
import com.figure.store.domain.model.product.Material;
import com.figure.store.domain.repository.product.MaterialRepository;

@Service
public class MaterialService {
	
	private MaterialRepository materialRepository;
	
	@Autowired
	public MaterialService(MaterialRepository materialRepository){
		this.materialRepository = materialRepository;
	}
	
	public Material save(Material material){

		if(materialRepository.existsByName(material.getName())){
			throw new DomainException("Material já existente cadastrado");
		}
		
		Material savedMaterial = materialRepository.save(material);
		
		return savedMaterial;
	}
	
	public List<Material> listAll(){
		
		List<Material> allMaterials = materialRepository.findAll();
		
		return allMaterials;
	}

	public Boolean exists(Material material){
		return materialRepository.existsById(material.getId());
	}
	
	
}
