package com.cv.entiter;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Personne implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id  @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nom;
	private String prenom;
}
