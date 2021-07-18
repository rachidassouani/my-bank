package io.rachidassouani.mybank.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("savings")
public class SavingsAccount extends Account {

    private double rate;


    // Getters & Setters


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
