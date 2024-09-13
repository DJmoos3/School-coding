import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sek;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur mycket svenska kronor vill du konvertera?");
        sek = sc.nextInt();
        double usd = sek * 0.097;
        double euro = sek * 0.088;

        System.out.println(sek + " är lika " + usd + " USD eller " + euro + " Euro");
    }
}