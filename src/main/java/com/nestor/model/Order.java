package com.nestor.model;

import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Order {	
	@NotBlank(message="El nombre es obligatorio")
	private String name;
	@NotBlank(message="La calle es obligatoria")
	private String street;
	@NotBlank(message="La ciudad es obligatoria")
	private String city;
	@NotBlank(message="El estado es obligatorio")
	private String state;
	@NotBlank(message="El nombre es obligatorio")
	private String zip;
	@CreditCardNumber(message="No es un número de tarjeta válido")
	private String ccNumber;
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="Debe estar formateada como MM/YY")
	private String ccExpiration;
	@Digits(integer=3, fraction=0)
	private String ccCVV;
	
}
