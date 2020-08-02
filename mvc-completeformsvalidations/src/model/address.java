package model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class address {
@NotBlank(message="please fill the values")
@Length(min=6,max=12,message="please follow the  correct format")
private String street_name;

@NotBlank(message="please fill the values")
@Length(min=5,max=14,message="min=5 characthers and max=14 characthers")
private String city;

@NotBlank(message="please fill the values")
@Length(min=6,max=12,message="min=6 characthers and max=12")
private String country;

@NotNull(message="please fill the values")
@Range(min=0000 ,max=9999,message="incorrect id")
@Digits(integer=4,fraction=0,message="not following four digit pincode")
private int pincode;
public String getStreet_name() {
	return street_name;
}
public void setStreet_name(String street_name) {
	this.street_name = street_name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
