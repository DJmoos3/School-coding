import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int famn;
        Scanner sc = new Scanner(System.in);
        System.out.println("hur många famnar?");
        famn = sc.nextInt();
        int aln = famn * 3;
        int fot = aln * 2;
        int tum = fot * 12;
        double cm = tum * 2.54;

        System.out.println(famn + " Famnar är " + aln + " alnar, " + fot + " fot och " +
                tum + " tum. Vilket är " + cm + "cm.");

    }
}