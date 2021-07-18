package io.rachidassouani.mybank.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("current")
public class CurrentAccount extends Account {

    private double overdraft;


    // Getters & Setters

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
