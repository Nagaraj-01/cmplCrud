package com.Crudoperation.Service;

import java.util.List;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.DTO.StudentDTO;
import com.Crudoperation.Entity.Student;

public interface StudentService {
	
	public StudentDTO addStudent(StudentDTO studentDTO);
	
	public List<Student> getAllStudents();
	
	public StudentDTO updateStudent(StudentDTO studentDTO);
	
	public String deleteStudent(Long id);
	
	public StudentDTO getStudentById(Long id);
	
	public String updateStudentStatus(Long id, String status);
	
	public  AddressDTO getAddressById(Long id);

	
}
