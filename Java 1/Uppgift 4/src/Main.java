import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hur gammal är du?");

        age = sc.nextInt();

        int months = age * 12;
        int days = age * 365;
        int min = days * 24 * 60;

        System.out.println("omvandlat så är din ålder " + months + " månader, " + days +
                " dagar eller " + min + " minuter.");

    }
}