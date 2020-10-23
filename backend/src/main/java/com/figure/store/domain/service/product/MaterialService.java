package com.figure.store.domain.service.product;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
		
		Optional<Material> existingMaterial = materialRepository.existsByName(material.getName());
		
		if(existingMaterial.isPresent() && !existingMaterial.get().equals(material)){
			throw new DomainException("Material já existente cadastrado");
		}
		
		Material savedMaterial = materialRepository.save(material);
		
		return savedMaterial;
	}
	
	public List<Material> listAll(){
		
		List<Material> Allmaterials = materialRepository.findAll();
		
		return Allmaterials;
	}
	
	
}
