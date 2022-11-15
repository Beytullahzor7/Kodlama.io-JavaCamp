package com.example.dataAccess.abstracts;

import com.example.entities.concretes.SoftwareLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SoftwareLanguageRepository extends JpaRepository<SoftwareLanguage, Integer> {

    Optional<SoftwareLanguage> findById(int id);
}
