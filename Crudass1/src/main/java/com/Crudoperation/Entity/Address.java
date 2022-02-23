package com.Crudoperation.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="Student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id", insertable=false,updatable = false)
	private Long id;
	
	@Column(name="addressType")
	private String adressType;
	
	@Column(name="houseNo")
	private  String houseNo;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	
	@Column(name="pincode")
	private String pincode;
	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumns({
//		@JoinColumn(name="std",referencedColumnName = "addresstype")
//	})
	@JsonIgnore
	@JoinColumn(name="student_id")
	private Student student;

	

}
