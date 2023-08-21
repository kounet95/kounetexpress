package com.example.kounetexpress.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dashbord {
    private Clients clients;
    private List<Booking> upcomingBookings;
    private List<Booking> pastBookings;
    private List<Notification> notifications;

    public Dashbord(Clients clients) {
        this.clients = clients;
        // Initialisation des listes et récupération des données du compte
    }

    public List<Booking> getUpcomingBookings() {
        return upcomingBookings;
    }

    public List<Booking> getPastBookings() {
        return pastBookings;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }
}



