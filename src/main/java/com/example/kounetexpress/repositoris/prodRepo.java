package com.example.kounetexpress.repositoris;

import com.example.kounetexpress.entity.Produits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface prodRepo extends JpaRepository<Produits, Long> {


}
