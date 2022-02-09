package com.cg.placementmanagement.Placement.repository;
import org.springframework.stereotype.Repository;

import com.cg.placementmanagement.Placement.model.Studentlogin;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentLoginRepository extends JpaRepository<Studentlogin, Long>{
	Studentlogin findByUsernameAndPassword(String username, String password);

}

