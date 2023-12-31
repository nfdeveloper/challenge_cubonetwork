package br.com.nfdeveloper.cubochallenger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nfdeveloper.cubochallenger.entity.Client;

@Repository	
public interface ClientRepository extends JpaRepository<Client, Long>{

}
