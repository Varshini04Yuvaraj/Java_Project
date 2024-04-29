package Task3;

public class User_Bank_Account 
{

    private double Balance;
    public User_Bank_Account(double Balance)
    {
        this.Balance=Balance;
        // System.out.println(+Balance);
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }

}
