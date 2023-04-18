package sn.alexisfy.AppliBanque;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.alexisfy.AppliBanque.model.Client;
import sn.alexisfy.AppliBanque.model.Compte;
import sn.alexisfy.AppliBanque.model.CompteCourant;
import sn.alexisfy.AppliBanque.model.CompteEpargne;
import sn.alexisfy.AppliBanque.model.Retrait;
import sn.alexisfy.AppliBanque.model.Versement;
import sn.alexisfy.AppliBanque.repository.ClientRepository;
import sn.alexisfy.AppliBanque.repository.CompteRepository;
import sn.alexisfy.AppliBanque.repository.OperationRepository;
import sn.alexisfy.AppliBanque.service.IBanqueService;

@SpringBootApplication
public abstract class AppliBanqueApplication  implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private IBanqueService banqueService;

	public static void main(String[] args) {
		SpringApplication.run(AppliBanqueApplication.class, args);
	}

	
	  @Override public void run(String... args) throws Exception { // TODO Auto-generated method stub
	  
	  Client c1 = clientRepository.save(new Client("Alexis NGUEFACK", "alexis_writemail@yahoo.com"));
	  Client c2 = clientRepository.save(new Client("Alexis_2 NGUEFACK", "alexis.nguefack@yahoo.fr"));
	  
	  Compte cp1 = compteRepository.save(new CompteCourant("c1", new Date(), 90000,c1, 6000)); 
	  Compte cp2 = compteRepository.save(new CompteEpargne("c2", new Date(), 6000, c2, 5.5));
	 
	  operationRepository.save(new Versement(new Date(), 9000, cp1));
	  operationRepository.save(new Versement(new Date(), 6000, cp1));
	  operationRepository.save(new Versement(new Date(), 2300, cp1));
	  operationRepository.save(new Retrait(new Date(), 9000, cp1));
	 
	  operationRepository.save(new Versement(new Date(), 2300, cp2));
	  operationRepository.save(new Versement(new Date(), 400, cp2));
	  operationRepository.save(new Versement(new Date(), 2300, cp2));
	  operationRepository.save(new Retrait(new Date(), 3000, cp2));
	 
	  banqueService.verser("c1", 111111);
	 
	 }
	 

}