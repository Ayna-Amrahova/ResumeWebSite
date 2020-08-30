package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.JobResponsibility;


@Repository
public interface JobResponsibilityRepository extends JpaRepository<JobResponsibility, Integer> {

	

}
