package Task3;

// import java.util.*;
class Atm_Machine extends User_Bank_Account implements User_Interface
{
    // private String bal;
    public Atm_Machine(double Balance) {
        super(Balance);
    }
    
    
    @Override
    public void Withdrawal(double withdrawal) {
        double yr_Balance=getBalance();
        if(yr_Balance>= withdrawal)
        {
              System.out.println("The Amount is withdrew");
              System.out.println("The balance amount in Your Account is "+(yr_Balance-withdrawal));
              setBalance(yr_Balance-withdrawal);
        }
        else{
            System.out.println("You are trying to withdraw an amount which is greater than your balance");
        }
        throw new UnsupportedOperationException("Unimplemented method 'Withdrawal'");
    }

    @Override
    public void Deposit(double dp_amt) {
         double yr_Balance=getBalance();
         yr_Balance+=dp_amt;
         System.out.println("The amount of "+dp_amt+"is deposited Successfully");
         
        throw new UnsupportedOperationException("Unimplemented method 'Deposit'");
    }

    @Override
    public void CheckBankBalance() {
        double yr_Balance=getBalance();
        System.out.println("You bank Balance is "+yr_Balance);
        throw new UnsupportedOperationException("Unimplemented method 'CheckBankBalance'");
    }
    
}