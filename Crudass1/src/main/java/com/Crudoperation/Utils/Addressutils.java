package com.Crudoperation.Utils;

import java.util.ArrayList;
import java.util.List;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.DTO.StudentDTO;
import com.Crudoperation.Entity.Address;

public class Addressutils {
	public static Address convertAddressDTOToDO(AddressDTO addressDTO)
	{
		Address address = new Address();
		
		address.setAdressType(addressDTO.getAddresstype());
		address.setHouseNo(addressDTO.getHouseNo());
		address.setCity(addressDTO.getCity());
		address.setState(addressDTO.getState());
		address.setPincode(addressDTO.getPincode());
		address.setId(addressDTO.getId());
		address.setStudent(addressDTO.getStudent());
		
		return address;
		
	}
	
	public static AddressDTO convertAddressDOToDTO(Address address)
	{
		AddressDTO addressDTO = new AddressDTO();
		
		addressDTO.setAddresstype(address.getAdressType());
		addressDTO.setHouseNo(address.getHouseNo());
		addressDTO.setCity(address.getCity());
		addressDTO.setState(address.getState());
		addressDTO.setPincode(address.getPincode());
		addressDTO.setId(address.getId());
	//	addressDTO.setStudentDTO(StudentUtils.convertStudentDOToDTO(address.getStudent()));
	//	addressDTO.setStudentDTO(StudentUtils.convertStudentDOToDTO(address.getStudent()));
		
//		StudentDTO studentdto =new StudentDTO();
//		
//		
//		List<StudentDTO> std =new ArrayList<StudentDTO>();
//		std.set(1, studentdto);
//		addressDTO.getStudentDTO();
		
		return addressDTO;
		
	}

}
