package com.example.airport.airportEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter@Setter
public class AirportData {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightNo;
    private LocalDateTime departureDateTime;
    private String departureAirport;
    private LocalDateTime arrivalDateTime;
    private String arrivalAirport;
}
