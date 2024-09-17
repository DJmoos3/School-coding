//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(150.0);
        Account account3 = new Account(300.0, "Daniel");

        account3.deposit(20.5);
        account2.withdraw(23.59);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

    }
}