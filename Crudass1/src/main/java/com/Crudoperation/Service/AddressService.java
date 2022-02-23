package com.Crudoperation.Service;

import java.util.List;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.DTO.StudentDTO;
import com.Crudoperation.Entity.Address;

public interface AddressService {
	public AddressDTO saveAddress(AddressDTO addresDTO);
	
	public AddressDTO updateAddress(AddressDTO addressDTO);
	
	public String deleteAddressById(Long id);
	
	public AddressDTO getAddressById(Long id);
	
	public List<Address> getAllAddresss();
	
//	public StudentDTO getStudentById(Long id);

}
