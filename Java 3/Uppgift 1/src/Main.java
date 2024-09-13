import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nameAmnt;
        Scanner sc = new Scanner(System.in);

        //
        System.out.println("Hur många namn vill du lägga till?");
        nameAmnt = sc.nextInt();
        sc.nextLine(); // tar bort enter
        // Ta bort dessa rader och gör sträng arrayens mängd namn till 5 om man vill ha en statisk siffra
        String[] names = new String[nameAmnt];
        System.out.println("Vilka namn vill du lägga till");

        for(int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(" ");
        for(int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}