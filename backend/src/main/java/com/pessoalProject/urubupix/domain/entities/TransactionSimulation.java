package com.pessoalProject.urubupix.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class TransactionSimulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal chosenAmout;
    private BigDecimal returnValue;

    public TransactionSimulation(){
    }

    public TransactionSimulation(Long id, BigDecimal chosenAmout, BigDecimal returnValue) {
        this.id = id;
        this.chosenAmout = chosenAmout;
        this.returnValue = returnValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getChosenAmout() {
        return chosenAmout;
    }

    public void setChosenAmout(BigDecimal chosenAmout) {
        this.chosenAmout = chosenAmout;
    }

    public BigDecimal getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(BigDecimal returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionSimulation that = (TransactionSimulation) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
