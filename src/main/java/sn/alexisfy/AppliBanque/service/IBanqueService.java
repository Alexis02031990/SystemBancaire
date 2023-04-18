package sn.alexisfy.AppliBanque.service;

import java.util.List;

import sn.alexisfy.AppliBanque.model.Compte;
import sn.alexisfy.AppliBanque.model.Operation;

public interface IBanqueService {
	
	public Compte consulterCompte(String codeCpte);
	public Iterable<Compte> getListCompte();
	public void fermerCompte(String codeCompte);
	public void verser(String codeCpte, double montant);
	public void retirer(String codeCpte, double montant);
	public void virement(String codeCpte1, String  codeCpte2, double montant);
	public List<Operation> listOperation(String codeCpte);

}
