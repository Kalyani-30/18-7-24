package com.noteric.p1.Service;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public class EligiblityCheck {
    public LoanApproval loanApproval;
    public EligiblityCheck(LoanApproval loanApproval){
        this.loanApproval=loanApproval;
    }
    public String loanEligiblity(int months){
        //System.out.println(loanApproval.loanAmount);
        double partOfSaving=0.6*loanApproval.saving;
        double amountPerMon=loanApproval.loanAmount/months;
        if(partOfSaving>=amountPerMon){
            System.out.println("eliglible");
        }
        else{
            System.out.println("not eliglible");
        }
        return UUID.randomUUID().toString();
    }
}
