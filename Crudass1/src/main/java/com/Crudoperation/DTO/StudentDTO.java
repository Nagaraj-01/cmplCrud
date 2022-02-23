package com.Crudoperation.DTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.Crudoperation.Entity.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String student_Name;
	
	private String course;
	
	private String department;
	
	private String year;

	private String active;
	
	private List<Address> addressDTO;
	

}
