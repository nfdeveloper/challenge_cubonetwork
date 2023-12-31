package br.com.nfdeveloper.cubochallenger.repository;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.nfdeveloper.cubochallenger.entity.Client;

@DataJpaTest
public class ClientRepositoryTest {

	@Autowired
	private ClientRepository clientRepository;
	
	private Client client;
	
	@BeforeEach
	private void setClientConfiguration() {
		
		this.client = new Client("Nilton","Filho", new BigDecimal(20.0));
		
	}
	
	@Test
	public void saveClient() {
		
		Client savedClient = clientRepository.save(client);
		
		Assertions.assertNotNull(savedClient);
		Assertions.assertEquals(savedClient, client);
		Assertions.assertNotNull(savedClient.getId());
	}
	
	@Test
	public void findAllClients() {
		Client savedClient = clientRepository.save(client);
		Client savedClient2 = clientRepository.save(client);
		
		List<Client> listClients = clientRepository.findAll();
	
		Assertions.assertNotNull(listClients);
		Assertions.assertEquals(listClients.get(0), savedClient);
	}
}
