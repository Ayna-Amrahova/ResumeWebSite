package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AboutInformation;

@Repository
public interface AboutInformationRepository extends JpaRepository<AboutInformation, Integer>{

}
