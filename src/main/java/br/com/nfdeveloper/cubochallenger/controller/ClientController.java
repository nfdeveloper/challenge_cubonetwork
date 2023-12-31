package br.com.nfdeveloper.cubochallenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nfdeveloper.cubochallenger.entity.Client;
import br.com.nfdeveloper.cubochallenger.entity.dto.ClientDTO;
import br.com.nfdeveloper.cubochallenger.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@PostMapping("/save")
	public ResponseEntity<Client> saveClient(@RequestBody ClientDTO clientDTO){
		Client client = service.saveClient(clientDTO);
		return ResponseEntity.ok().body(client);	
	}
	
	@GetMapping
	public ResponseEntity<List<Client>> listAllClients(){
		List<Client> clientList = service.listAllClients();
		return ResponseEntity.ok().body(clientList);
	}
}
