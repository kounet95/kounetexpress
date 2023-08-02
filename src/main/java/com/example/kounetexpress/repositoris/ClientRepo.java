package com.example.kounetexpress.repositoris;

import com.example.kounetexpress.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository <Clients, Long> {


}
