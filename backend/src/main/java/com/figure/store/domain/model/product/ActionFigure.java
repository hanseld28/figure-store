package com.figure.store.domain.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
public class ActionFigure {

	@Id
	private Long id;

	private String name;

	private Double price;

	private String shortDescription;

	private String longDescription;

	private Integer approximateHeight;

	private Integer recommendedAge;

	private Boolean male;

	private Boolean fullAngleImage;

	@OneToMany
	private Collection<Category> category;

	@OneToOne
	private Manufacturer manufacturer;

	@OneToMany
	private Collection<Material> material;

}
