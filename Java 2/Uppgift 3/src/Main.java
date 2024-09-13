import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("vilket år är det du undrar om det är skottår?");
        year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println("det är ett skottår");
        }
        else {
            System.out.println("det är inte ett skottår");
        }
    }
}