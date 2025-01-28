package zz_daw_proyecto_lombok;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Contacto {
	
	private String nombre;
	private String telefono;
	private String direccion;
	
	

}
