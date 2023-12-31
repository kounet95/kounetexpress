package com.example.kounetexpress.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produits {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProd;
    private String designation;
    private Double prix;
    private String prodFour;
    @ManyToMany(mappedBy = "clientsProd")
    private List<Clients> cliCommand;
}
