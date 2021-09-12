package com.cv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.entiter.Personne;

public interface DaoCreationCV extends JpaRepository<Personne,Long>{ 

}
