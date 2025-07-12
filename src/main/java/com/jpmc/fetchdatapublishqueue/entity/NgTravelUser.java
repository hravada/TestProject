package com.jpmc.fetchdatapublishqueue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class NgTravelUser {
    private int travelNumber;
    private String travelUserName;
    private String travelUserEmail;

    // No-arg constructor (optional if already present)
    public NgTravelUser() {
    }

    public NgTravelUser(int travelNumber, String travelUserName, String travelUserEmail) {
        this.travelNumber = travelNumber;
        this.travelUserName = travelUserName;
        this.travelUserEmail = travelUserEmail;
    }

    public int getTravelNumber() {
        return travelNumber;
    }

    public void setTravelNumber(int travelNumber) {
        this.travelNumber = travelNumber;
    }

    public String getTravelUserName() {
        return travelUserName;
    }

    public void setTravelUserName(String travelUserName) {
        this.travelUserName = travelUserName;
    }

    public String getTravelUserEmail() {
        return travelUserEmail;
    }

    public void setTravelUserEmail(String travelUserEmail) {
        this.travelUserEmail = travelUserEmail;
    }

    @Override
    public String toString() {
        return "NgTravelUser{" +
                "travelNumber=" + travelNumber +
                ", travelUserName='" + travelUserName + '\'' +
                ", travelUserEmail='" + travelUserEmail + '\'' +
                '}';
    }
}
