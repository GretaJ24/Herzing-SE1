package com.example.unit6.model;

import jakarta.persistence.*;

//Table Service
@Entity
@Table(name = "tables")
public class tables {
    //tableID, partySize, cleanStatus, useStatus
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableID;

    private Integer partySize;

    private Boolean cleanStatus;

    private Boolean useStatus;

    //getters and setters
    public Long getTableID() {
        return tableID;
    }   
    public void setTableID(Long tableID) {
        this.tableID = tableID;
    }
    public Integer getPartySize() {
        return partySize;
    }
    public void setPartySize(Integer partySize) {
        this.partySize = partySize;
    }
    public Boolean getCleanStatus() {
        return cleanStatus;
    }
    public void setCleanStatus(Boolean cleanStatus) {
        this.cleanStatus = cleanStatus;
    }
    public Boolean getUseStatus() {
        return useStatus;
    }
    public void setUseStatus(Boolean useStatus) {
        this.useStatus = useStatus;
    }
    
}
