package com.one.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.college.entity.Admission;

public interface AdmissionRepo extends JpaRepository<Admission,Long>{

	

}
