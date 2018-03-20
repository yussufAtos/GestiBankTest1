package com.example.demo;


import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class CompteController {

	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private DepotRepository depotRepository;

	@RequestMapping( "/")

	public String index(Model model ) {

	
	List<Compte> comptes =	compteRepository.findAll();
	List<Client> clients =	clientRepository.findAll();
	List<Depot> depots =	depotRepository.findAll();
		
//	Metier met=new Metier();
	
//	Compte cp=met.consulterConte((long) 2);
//Compte cp=compteRepository.findOne((long) 3);
//	Compte cp=compteRepository.findOne((long) 3);
	
model.addAttribute("comptes",comptes);
model.addAttribute("clients",clients);
model.addAttribute("depots",depots );


//model.addAttribute("compte",cp);
	
	

//		ArrayList<Compte> comptes = (ArrayList<Compte>) compteRepository.findAll();
//        model.addAttribute("listcomptes",comptes);

    
    return "compte";
	}
	
	@RequestMapping( value ="/form", method=RequestMethod.GET)
	public String formCompte(Model model ) {
	
		return "form";
	}

	@RequestMapping( value ="/save", method=RequestMethod.POST)
	public String save(Model model ,Compte compte ) {
		compteRepository.save(compte );
		model.addAttribute("compte",compte);
		return "hello";
	}
	
	@RequestMapping( value ="/depot", method=RequestMethod.POST)
	public String depot(Model model ,Long codeCompte,double montant ) {
		
	Compte cp=compteRepository.findOne(codeCompte);
//	System.out.println("le codecompte"+cp.getCodeCompte());
	    Depot dep=new Depot(montant,new Date(),cp);
	    depotRepository.save(dep);
		cp.setSolde(cp.getSolde()+montant);
		compteRepository.save(cp );
		model.addAttribute("compte",cp);
		model.addAttribute("depot",dep);
		
		
		return "hello";
	}
	
	
}
