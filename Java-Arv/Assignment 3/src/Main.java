public class Main
{
    public static void main(String[] args)
    {
        Account account1 = new Account();
        Account account2 = new Account(150.0);
        Account account3 = new Account(300.0, "Daniel");
        SavingsAccount account4 = new SavingsAccount(1000.0, "Hampus", 1.03);

        account3.deposit(20.5);
        account2.withdraw(23.59);
        account4.addInterest();
        account4.transfer(30.0, account1);
        account4.transfer(1030.0, account3);
        account2.withdraw(500.0);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);

    }
}