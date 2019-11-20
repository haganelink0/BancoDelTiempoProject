package com.timeBank;


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="usuarios")
public class User extends UserInterface {

	@Id
	@Column(name="email")
	private String email;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="confrimPassword")
	private String confirmPassword;
	@Column(name="BIRTH_DAY")
	private String birthDay;
	@Column(name="location")
	private String location ;
	@Column(name="horas")
	private int horas;
	@Column(name="phonenumber")
	private int phoneNumber;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="email")
	private Set<Jobs> job;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String password) {
		this.confirmPassword = password;
	}
	
	public String getBirthDate() {
		return birthDay;
	}
	public void setBirthDate(String birthDate) {
		this.birthDay = birthDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Set<Jobs> getJob() {
		return job;
	}
	public void setJob(Set<Jobs> job) {
		this.job = job;
	}
	
	public User(String email, String name, String password, String confirmPassword, String birthDate, String location,
			int horas, int phoneNumber, Set<Jobs> job) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.birthDay = birthDate;
		this.location = location;
		this.horas = horas;
		this.phoneNumber = phoneNumber;
		this.job = job;
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public User() {
		super();
	}
	

	
	
}
