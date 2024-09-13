import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vad heter du?");

        name = sc.nextLine();

        System.out.println("Och hur gammal är du?");

        age = sc.nextInt();

        System.out.println("Du heter "  + name + " och är " + age + " år gammal.");




    }
}