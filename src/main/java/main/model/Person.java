package main.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Apr 3, 2024
 */

 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	//Attributes
	@Id
	@GeneratedValue
	private int guestId;
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zip;
	private int phoneNo;
	@ManyToOne
	private Trip trip;

}
