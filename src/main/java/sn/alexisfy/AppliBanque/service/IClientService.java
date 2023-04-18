package sn.alexisfy.AppliBanque.service;

import java.util.Optional;

import sn.alexisfy.AppliBanque.model.Client;

/**
 * @author afdio
 *
 */
public interface IClientService {
	
	public Optional<Client> getClient(final Long codeClient);
	public Iterable<Client> getAllClients();
	public void deleteClient(final Long codeClient);
	public Client saveClient(Client client);
	public Client updateClient(Long codeClient, Client client);

}
