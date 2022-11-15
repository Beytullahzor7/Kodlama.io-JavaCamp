package com.example.dataAccess.abstracts;

import com.example.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
