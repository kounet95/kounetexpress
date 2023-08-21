package com.example.kounetexpress.entity;
import com.example.kounetexpress.entity.Booking;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nom;
    private String prenom;
    private String email;
    private int age;
    private String paysDorigine;
    private  String paysResidence;
    private Long prodId;
    @OneToMany(mappedBy = "clients",fetch = FetchType.LAZY)
    private List<Booking> bookings;
}
