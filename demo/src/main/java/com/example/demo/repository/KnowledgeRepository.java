package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Knowledge;


@Repository
public interface KnowledgeRepository extends JpaRepository<Knowledge, Integer> {

}
