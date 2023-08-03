package com.pessoalProject.urubupix.domain.dto;


import com.pessoalProject.urubupix.domain.entities.TransactionSimulation;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionSimulationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private BigDecimal chosenAmout;
    private BigDecimal returnValue;


    public TransactionSimulationDTO(TransactionSimulation entity){
        this.chosenAmout = entity.getChosenAmout();
        this.returnValue = entity.getReturnValue();
    }

    public TransactionSimulationDTO(BigDecimal chosenAmount, BigDecimal returnValue) {
        this.chosenAmout = chosenAmount; // Corrigido para chosenAmount
        this.returnValue = returnValue; // Corrigido para returnValue
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
}
