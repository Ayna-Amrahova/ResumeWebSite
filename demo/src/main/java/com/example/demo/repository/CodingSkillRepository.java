package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CodingSkill;

@Repository
public interface CodingSkillRepository extends JpaRepository<CodingSkill, Integer>{

}
