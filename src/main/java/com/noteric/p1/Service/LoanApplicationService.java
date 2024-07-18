package com.noteric.p1.Service;

import com.noteric.p1.model.LoanApplication;

import java.util.UUID;

public class LoanApplicationService {

  public String loanProcessing(LoanApplication loanApplication){
    if(loanApplication.occupation.sal==loanApplication.occupation.expenditure){
       return "";
    }
    else {
      loanApplication.loanAppNo = UUID.randomUUID().toString();
      return loanApplication.loanAppNo;
    }
  }

}
