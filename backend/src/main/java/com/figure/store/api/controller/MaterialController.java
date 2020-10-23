package com.figure.store.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.figure.store.domain.model.product.Material;
import com.figure.store.domain.service.product.MaterialService;

/**
 * author Gabriel Victor
 */

@RestController
@RequestMapping(path = "/materials")
public class MaterialController {
	
	private MaterialService materialService;
	
	@Autowired
	public MaterialController(MaterialService materialService){
		this.materialService = materialService;
	}
	
	@PostMapping
	public Material save(@Valid @RequestBody Material material){
		return materialService.save(material);
	}
	
	@GetMapping
	public List<Material> listAll(){
		
		return materialService.listAll();
		
	}
}
