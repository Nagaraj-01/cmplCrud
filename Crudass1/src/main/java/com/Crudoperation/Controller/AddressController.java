//package com.Crudoperation.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.Crudoperation.DTO.AddressDTO;
//import com.Crudoperation.Service.AddressService;
//
//@RestController
//@RequestMapping("/address1")
//public class AddressController {
//	
//	@Autowired
//	private AddressService addressService;
//	
//	@PostMapping("/save")
//	private AddressDTO saveAddressDTO(@RequestBody AddressDTO addressDTO) {
//		return addressService.saveAddress(addressDTO);
//		
//	}
//	
//	@PutMapping("/saveaddress")
//	private AddressDTO updateAddressDTO(@RequestBody AddressDTO addressDTO) {
//		return addressService.updateAddress(addressDTO);
//		
//	}
//
//}
