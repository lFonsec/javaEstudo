package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class programa {
    public static void main(String[] args) throws Exception {
        Account acc = new Account(1001, "alex", 0.0);
        Account bacc = new BusinessAccount(1002, "maria", 1000.0, 500.0);
        System.out.println(acc.getBalance());
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc2 = new SavingsAccount(1003, "pedro", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        bacc.withdraw(200);
        System.out.println(bacc.getBalance());


      /*   //Upcasting
        
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "pedro", 0.0, 100.0);
        Account acc3 = new SavingsAccount(1004, "ana", 0.0, 300.0);
    
        //Downcasting

        BusinessAccount bacc2 = (BusinessAccount)acc2;
        //BusinessAccount bacc3 = (BusinessAccount)acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount bacc4 = (BusinessAccount)acc3;
            bacc4.loan(100.0);
            System.out.println("loan");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc4 = (SavingsAccount)acc3;
            acc4.updateBalance();
            System.out.println("update");

        }
        */
        
    } 
}
