package modelo.javabean;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of="countryId")

public class Country {
	
	private String countryId;
	private String countryName;
	private Region region;
	
	
	
	
	

}
