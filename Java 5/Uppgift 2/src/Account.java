public class Account
{
    double balance;
    String name;

    public Account()
    {
        this.balance = 0;
    }
    public Account (double balance)
    {
        this.balance = balance;
    }
    public Account(double balance, String name)
    {
        this.balance = balance;
        setName(name);
    }

    @Override
    public String toString()
    {
        if (this.name != null)
        {
            return "Name: " + getName() + " Balance: " + this.balance;
        }
        else
        {
            return "Name: " + " Balance: " + this.balance;
        }
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        this.balance -= amount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
