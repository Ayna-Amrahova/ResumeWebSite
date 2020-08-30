package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SocialLogo;

@Repository
public interface SocialLogoRepository extends JpaRepository<SocialLogo, Integer> {

}
