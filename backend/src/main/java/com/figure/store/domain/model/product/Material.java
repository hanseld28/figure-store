package com.figure.store.domain.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
public class Material {

	@Id
	private Long id;

	private String name;

}
