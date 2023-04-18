package sn.alexisfy.AppliBanque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.alexisfy.AppliBanque.model.Compte;


public interface CompteRepository extends JpaRepository<Compte, String> {

}
