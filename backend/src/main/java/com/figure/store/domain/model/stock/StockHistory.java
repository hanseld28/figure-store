package com.figure.store.domain.model.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
public class StockHistory {

	@Id
	private Long id;

	private OffsetDateTime date;

	@OneToOne
	private Stock stock;

}
