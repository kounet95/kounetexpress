package com.example.kounetexpress.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {
     @Id
     private Long id;

     @ManyToOne
     @JoinColumn(name = "user_id")
     private Clients clients;

     @ManyToOne
     @JoinColumn(name = "trip_id")
     private Trip trip;
     private String status;
}
