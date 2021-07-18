package io.rachidassouani.mybank.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("withdrawal")
public class Withdrawal extends Transaction {

}
