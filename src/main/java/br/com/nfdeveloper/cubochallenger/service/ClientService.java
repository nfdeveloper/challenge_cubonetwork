package br.com.nfdeveloper.cubochallenger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nfdeveloper.cubochallenger.entity.Client;
import br.com.nfdeveloper.cubochallenger.entity.dto.ClientDTO;
import br.com.nfdeveloper.cubochallenger.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public Client saveClient(ClientDTO clientDTO) {
		Client client = new Client();
		
		client.setFirstName(clientDTO.firstName());
		client.setLastName(clientDTO.lastName());
		client.setParticipation(clientDTO.participation());
		
		if(client == null || client.getFirstName() == null 
				|| client.getLastName() == null
				|| client.getParticipation() == null) {
			throw new NullPointerException();
		}
		
		return repository.save(client);
	}

	public List<Client> listAllClients(){
		List<Client> list = repository.findAll();
	
		if(list == null) {
			throw new NullPointerException();
		}
		
		return list;
	}
}
