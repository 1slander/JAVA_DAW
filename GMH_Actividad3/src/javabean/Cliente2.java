package javabean;

import java.time.LocalDate;
import java.util.ArrayList;

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



public class Cliente2 {
	private String idCliente;
	private String nombre;
	private String email;
	private LocalDate createdAt;
	private DireccionCliente direccion;
	private ArrayList<TarjetaBancaria> tarjeta;
	
}