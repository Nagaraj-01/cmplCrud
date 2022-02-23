package com.Crudoperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.Crudoperation.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
	@Query("select s from Address s where s.id=:id")
	void getStudentById(@Param("id") Long id);


}
