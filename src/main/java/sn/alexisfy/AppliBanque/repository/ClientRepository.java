package sn.alexisfy.AppliBanque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.alexisfy.AppliBanque.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
