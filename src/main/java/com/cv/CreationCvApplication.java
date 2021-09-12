package com.cv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cv.dao.DaoCreationCV;
import com.cv.entiter.Personne;

@SpringBootApplication
public class CreationCvApplication implements CommandLineRunner{

	@Autowired
	private DaoCreationCV creationCV;
	public static void main(String[] args) {
		SpringApplication.run(CreationCvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		creationCV.save(new Personne(null,"coulibaly","Mouhamed"));
		creationCV.save(new Personne(null,"konan","abdalah"));
		
	}

}
