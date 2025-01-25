package javabean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class TarjetaBancaria {
	
	private long numero;
	private int year;
	private int mes;
	private int cvv;
	private String titularTarjeta;
	private Banco banco;

}
