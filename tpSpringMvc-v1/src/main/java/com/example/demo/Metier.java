package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class Metier {
	
	@Autowired
	private DepotRepository depotRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private ClientRepository clientRepository;	
	
	
	public Metier() {
		
	}


	public Compte consulterConte(Long id) {
		Compte cp=compteRepository.findOne(id);
		return cp;
	}

}
