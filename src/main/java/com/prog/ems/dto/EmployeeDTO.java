package com.prog.ems.dto;

public class EmployeeDTO {
	public EmployeeDTO(Long id2, String firstName2, String lastName2, String email2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.firstName=firstName2;
		this.lastName=lastName2;
		this.email=email2;
	}
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
