package com.emp.emp.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Entity annotation defines that a 
//class can be mapped to a table
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Emp")
public class Emp {
 
 // @ID This annotation specifies 
 // the primary key of the entity.

 
 // @GeneratedValue This annotation 
 // is used to specify the primary 
 // key generation strategy to use
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
 	private Integer id;
	private String name;
	private Integer salary;
	private String status = "A";

	public Emp(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", status=" + status + "]";
	}

	

}