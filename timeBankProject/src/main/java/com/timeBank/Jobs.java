package com.timeBank;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Jobs implements JobsInterface {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	int id;
	@Column(name = "category")
	private String category;
	@Column(name = "description")
	private String description;
	@Column(name = "disponibility")
	private String disponibility;
	@Column(name="state")
	private String state;
	@ManyToOne
	@JoinColumn(name = "email")
	private User user;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDisponibility() {
		return disponibility;
	}
	public void setDisponibility(String disponibility) {
		this.disponibility = disponibility;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

	public Jobs(int id, String category, String description, String disponibility, String state, User user, String name,
			String location) {
		super();
		this.id = id;
		this.category = category;
		this.description = description;
		this.disponibility = disponibility;
		this.state = state;
		this.user = user;
		this.name = name;
		this.location = location;
	}
	public Jobs(int id) {
		super();
		this.id = id;
	}
	public Jobs() {
		super();
	}
	
	
}