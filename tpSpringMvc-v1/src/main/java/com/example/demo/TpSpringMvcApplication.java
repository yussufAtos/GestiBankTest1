package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringMvcApplication implements CommandLineRunner {

	@Autowired
	private DepotRepository depotRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpSpringMvcApplication.class, args);

		// ApplicationContext ctx =SpringApplication.run(TpSpringMvcApplication.class,
		// args);
		// CompteRepository compteRepository =ctx.getBean(CompteRepository.class);
		// ClientRepository clientRepository =ctx.getBean(ClientRepository.class);

	

	
	}

/*	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//	Compte	 cp=compteRepository.findOne((long) 4);
//	System.out.println("le codecompte"+cp.getCodeCompte());
//	Depot dep=new Depot(15 ,new Date(),cp);
//			depotRepository.save(dep);
//				cp.setSolde(cp.getSolde()+15);
//				compteRepository.save(cp );
		
		
//		Compte cp=compteRepository.findOne((long) 3);
//		 System.out.println(cp.getLibelle());	
	
	
	
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//
//		Client client1 = clientRepository.save(new Client("Brahim", " brahim"));
//		Compte compte1 = compteRepository.save(new Compte("compte1", 100, client1));
//		Compte compte2 = compteRepository.save(new Compte("compte2", 100, client1));
//		Compte compte3 = compteRepository.save(new Compte("compte3", 100, client1));
//		Depot vers1 = depotRepository.save(new Depot(10, new Date(), compte1));
//		Depot vers2 = depotRepository.save(new Depot(10, new Date(), compte1));
//
//	}





}


