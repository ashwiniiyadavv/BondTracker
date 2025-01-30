package com.bondtracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
public class Bond {

    @Id
    private Long bondId;
    private String customerId;
    private String bondName;
    private LocalDate maturityDate;
    private boolean isActive;

    // Getters and Setters
 public Long getBondId() {
        return bondId;
    }

    public void setBondId(Long bondId) {
        this.bondId = bondId;
    }

    // Getter and Setter for customerId
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // Getter and Setter for bondName
    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    // Getter and Setter for maturityDate
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    // Getter and Setter for isActive
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
