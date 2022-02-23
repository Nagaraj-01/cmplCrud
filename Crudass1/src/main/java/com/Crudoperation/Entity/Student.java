package com.Crudoperation.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data@Entity
@Table(name="Student2")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",insertable = false,updatable = false)
	private Long id;
	
	@Column(name="Student_Name")
	private String student_Name;
	
	@Column(name="Course")
	private String course;
	
	@Column(name="departnemt")
	private String Department;
	
	@Column(name="Year")
	private String year;
	
	@Column(name="active")
	private  String active;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Address> address;

}
