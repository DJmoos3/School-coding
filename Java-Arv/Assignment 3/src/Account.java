public class Account
{
    private double balance;

    private String name;

    public Account()
    {
        setBalance(0.0);
    }
    public Account (double balance)
    {
        setBalance(balance);
    }
    public Account(double balance, String name)
    {
        setBalance(balance);
        setName(name);
    }

    @Override
    public String toString()
    {
        if (this.name != null)
        {
            return "Name: " + getName() + " Balance: " + getBalance();
        }
        else
        {
            return "Name: " + " Balance: " + getBalance();
        }
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        if (amount <= getBalance())
        {
            setBalance(getBalance()-amount);
        }
        else
        {
            System.out.println("Not enough money in account.");
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
