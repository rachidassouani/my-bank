package io.rachidassouani.mybank.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("deposit")
public class Deposit extends Transaction {


}
