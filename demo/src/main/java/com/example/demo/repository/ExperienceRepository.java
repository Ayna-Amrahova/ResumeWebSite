package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Experience;


@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer>{

}
