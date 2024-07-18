package com.noteric.p1;

import com.noteric.p1.Service.EligiblityCheck;
import com.noteric.p1.Service.LoanApproval;
import com.noteric.p1.Service.LoanApplicationService;
import com.noteric.p1.model.Address;
import com.noteric.p1.model.Customer;
import com.noteric.p1.model.LoanApplication;
import com.noteric.p1.model.Occupation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLoan {
    @Test
    public void Test() {
        LoanApplication loanApplication = new LoanApplication();
        Customer customer=new Customer();
        Address address=new Address();
        Occupation occupation=new Occupation();
        customer.name="kalyani";
        customer.phnno="955350234";
        customer.email="kalyani@23";
        address.area="kphb";
        address.city="hyd";
        address.pincode="50070";
        customer.address=address;
        occupation.role="test developer";
        occupation.sal=70000;
        occupation.email="kallu@2344";
        occupation.address=address;
        occupation.expenditure=20000;
        loanApplication.address=address;
        loanApplication.customerDetails=customer;
        loanApplication.occupation=occupation;
        LoanApplicationService loneApplicationService=new LoanApplicationService();
        String loanAppNo=loneApplicationService.loanProcessing(loanApplication);
        Assertions.assertNotNull(loanAppNo);
        LoanApproval loanApproval=new LoanApproval();
        int loanamount=loanApproval.loanAmountApproval(loanApplication);
        Assertions.assertNotNull(loanamount);
        EligiblityCheck eligiblityCheck=new EligiblityCheck(loanApproval);
        String loanNo=eligiblityCheck.loanEligiblity(12);
        Assertions.assertNotNull(loanNo);


    }

}

