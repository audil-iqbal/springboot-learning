package com.example.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientsRepo extends JpaRepository<Clients,Integer> {

}
