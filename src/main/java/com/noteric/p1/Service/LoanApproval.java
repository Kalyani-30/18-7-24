package com.noteric.p1.Service;

import com.noteric.p1.model.LoanApplication;

public class LoanApproval {

     public int loanAmount;
     public int saving;
     public int loanAmountApproval(LoanApplication loanApplication){
      saving=loanApplication.occupation.sal-loanApplication.occupation.expenditure;
      loanAmount=saving*10;
      return loanAmount;
     }
}
