package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the Value of your balance");
            double balance=obj.nextDouble();
            
            Atm_Machine obj2=new Atm_Machine(balance);

            System.out.println("Enter the Value of Amount need to be withdraw");
            double withdrawal=obj.nextDouble();
            obj2.Withdrawal(withdrawal);

            System.out.println("Enter the Value of Amount need to be deposited");
            double dp_amt=obj.nextDouble();
            obj2.Deposit(dp_amt);
            
            System.out.println("Your current Bank Balance:");
            obj2.CheckBankBalance();
        }
        
    }

}
