/*
package com.jpmc.fetchdatapublishqueue.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TRAVEL_NUMBER")
public class TravelNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "travel_number")
    private String travelNumber;

    public TravelNumber(Long id, String pnrNumber) {
        this.id = id;
        this.travelNumber = pnrNumber;
    }

    public Long getId() {
        return id;
    }

    public String getPnrNumber() {
        return travelNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPnrNumber(String pnrNumber) {
        this.travelNumber = pnrNumber;
    }

    @Override
    public String toString() {
        return "TravelNumber{" +
                "id=" + id +
                ", pnrNumber='" + travelNumber + '\'' +
                '}';
    }
}
*/
