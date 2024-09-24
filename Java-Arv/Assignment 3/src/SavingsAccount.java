public class SavingsAccount extends Account
{
    private double rate;

    public SavingsAccount(double balance, String name, double rate)
    {
        setBalance(balance);
        setName(name);
        setRate(rate);
    }

    public void addInterest()
    {
        setBalance(getBalance()*getRate());
    }

    public void transfer(double amount, Account account)
    {
        if(amount <= getBalance())
        {
            setBalance(getBalance() - amount);
            account.setBalance(account.getBalance() + amount);
        }
        else
        {
            System.out.println("Not enough money in account.");
        }
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;
    }
}
