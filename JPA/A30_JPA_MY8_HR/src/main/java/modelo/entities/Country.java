package modelo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@EqualsAndHashCode(of="countryId")
@Entity
@Table(name="countries")
public class Country implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="country_id")
	private String countryId;
	
	@Column(name="country_name")
	private String countryName;
	
	@ManyToOne
	@JoinColumn(name="region_id")
	private Region region;
	
	public Country(String countryId, String countryName, Region region) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.region = region;
	}
	public Country() {
		super();
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	@Override
	public int hashCode() {
		return Objects.hash(countryId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(countryId, other.countryId);
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", region=" + region + "]";
	}
	
	
	
	
	

}
