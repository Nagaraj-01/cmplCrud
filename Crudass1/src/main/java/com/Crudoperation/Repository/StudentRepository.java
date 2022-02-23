package com.Crudoperation.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Crudoperation.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	@Transactional
	@Modifying
	@Query("update Student a set a.active = :status where a.id = :id")
	 void updateStudentStatusById(@Param("id") long id, @Param("status") String status);
	

}
