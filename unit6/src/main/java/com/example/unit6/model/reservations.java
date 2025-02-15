package com.example.unit6.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reservations")
public class reservations {
    //reservationID, name, tableID, time, partySize, notes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationID;
    
    private String name;
    
    private Long tableID;
    
    private String time;
    
    private Long partySize;
    
    private String notes;

    //getters and setters
    public Long getReservationID() {
        return reservationID;
    }
    public void setReservationID(Long reservationID) {
        this.reservationID = reservationID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getTableID() {
        return tableID;
    }
    public void setTableID(Long tableID) {
        this.tableID = tableID;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Long getPartySize() {
        return partySize;
    }
    public void setPartySize(Long partySize) {
        this.partySize = partySize;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
