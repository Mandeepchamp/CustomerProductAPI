package com.maybank.demo.model;



import jakarta.persistence.*;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Schema(description = "Details about a customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Customer's ID", example ="1022")
    private Long id;
    @Schema(description = "Customer's first name", example = "Mandeep")
    private String firstName;
    @Schema(description = "Customer's last name", example = "Singh")
    private String lastName;
    @Schema(description = "Customer's email address", example = "mandeep.singh@example.com")
    private String email;
    @Schema(description = "Customer's email personal address", example = "singh.family@example.com")
    private String personalEmail;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public List<String> getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(List<String> familyMembers) {
		this.familyMembers = familyMembers;
	}

	
    @ElementCollection
    private List<String> familyMembers;

    // Getters and Setters
}
