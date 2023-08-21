package com.example.kounetexpress.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trip_id;
    private String destination;
    private Date date;
    private String itinere;
    @OneToMany(mappedBy = "trip")
    private List<Booking> bookings;

}
