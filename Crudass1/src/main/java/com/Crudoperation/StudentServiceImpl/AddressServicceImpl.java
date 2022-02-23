package com.Crudoperation.StudentServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.DTO.StudentDTO;
import com.Crudoperation.Entity.Address;
import com.Crudoperation.Entity.Student;
import com.Crudoperation.Repository.AddressRepository;
import com.Crudoperation.Repository.StudentRepository;
import com.Crudoperation.Service.AddressService;
import com.Crudoperation.Utils.Addressutils;
@Service
public class AddressServicceImpl extends Addressutils implements AddressService {
	@Autowired
	private AddressRepository addressRepository;
//	@Autowired
//	private StudentRepository studentRepository;

	@Override
	public AddressDTO saveAddress(AddressDTO addresDTO) {
		Address save= addressRepository.save(Addressutils.convertAddressDTOToDO(addresDTO));
		return Addressutils.convertAddressDOToDTO(save);
	}

	@Override
	public AddressDTO updateAddress(AddressDTO addressDTO) {
		Address add =addressRepository.save(Addressutils.convertAddressDTOToDO(addressDTO));
		return Addressutils.convertAddressDOToDTO(add);
	}

	@Override
	public String deleteAddressById(Long id) {
		addressRepository.deleteById(id);
		return "record deleted";
	}

	@Override
	public AddressDTO getAddressById(Long id) {
		return convertAddressDOToDTO(addressRepository.findById(id).get());
	}

	@Override
	public List<Address> getAllAddresss() {
		List<Address> findAll = addressRepository.findAll();
		return findAll ;
	}

//	@Override
//	public StudentDTO getStudentById(Long id) {
//		return convertStudentDOToDTO(studentRepository.findById(id).get());
//	}
//
//	private StudentDTO convertStudentDOToDTO(Student student) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
