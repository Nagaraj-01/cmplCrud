package com.Crudoperation.Utils;

import java.util.ArrayList;
import java.util.List;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.DTO.StudentDTO;
import com.Crudoperation.Entity.Student;

public class StudentUtils {
	public static Student convertStudentDTOToDO(StudentDTO studentDTO) {
		
		Student student =new Student();
		
		student.setId(studentDTO.getId());
		student.setStudent_Name(studentDTO.getStudent_Name());
		student.setCourse(studentDTO.getCourse());
		student.setDepartment(studentDTO.getDepartment());
		student.setYear(studentDTO.getYear());
		return student;
		
	}
	public static StudentDTO convertStudentDOToDTO (Student student) {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(student.getId());
		studentDTO.setStudent_Name(student.getStudent_Name());
		studentDTO.setCourse(student.getCourse());
		studentDTO.setDepartment(student.getDepartment());
		studentDTO.setYear(student.getYear());
		studentDTO.setAddressDTO(student.getAddress());

//		AddressDTO addresss=new AddressDTO();
//		addresss.setAddresstype("Office");
//		addresss.setCity("Bangalore");
//		addresss.setHouseNo("01");
//		addresss.setPincode("560084");
//		addresss.setState("karnataka");
		
		
//		AddressDTO addresss2=new AddressDTO();
//		addresss2.setAddresstype("amfhgjfsa");
//		addresss2.setCity("jshgdjasdf");
//		
//		
//		List<AddressDTO> listOfAddress=new ArrayList<AddressDTO>();
//		listOfAddress.add(addresss);
	//	listOfAddress.add(addresss2);
		
//		studentDTO.setAddressDTO(listOfAddress);
//		
		return studentDTO;
		
	}

}
