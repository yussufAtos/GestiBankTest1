package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CompteController {
	
@Autowired	
	
	CompteRepository  compteRepository  ;


@RequestMapping("/")
public String index(Model model ){
	
	List<Compte> listcomptes =compteRepository.findAll();
	
	model.addAttribute("listcompte",listcomptes);
	
	
	return "comptes";
}


}
