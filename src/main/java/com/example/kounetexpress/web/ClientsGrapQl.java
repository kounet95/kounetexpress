package com.example.kounetexpress.web;

import com.example.kounetexpress.entity.Clients;
import com.example.kounetexpress.repositoris.ClientRepo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientsGrapQl {
    private ClientRepo clientRepo;
    public ClientsGrapQl(ClientRepo clientRepo){
        this.clientRepo=clientRepo;
    }
    @QueryMapping
    public List<Clients> clientsList(){
        return clientRepo.findAll();
    }
}
