package com.figure.store.domain.model.stock;

import com.figure.store.domain.model.product.ActionFigure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
public class Stock {

	@Id
	private Long id;

	private Integer amount;

	@OneToOne
	private ActionFigure actionFigure;

}
