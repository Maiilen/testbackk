package com.portfolio.ymo.Repository;

import com.portfolio.ymo.Entity.Skills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RSkills extends JpaRepository<Skills, Integer>{
  
}