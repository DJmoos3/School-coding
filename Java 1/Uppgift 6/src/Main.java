import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String answer;
        int length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv vad som helst");
        answer = sc.nextLine();
        length = answer.length();


        System.out.println(answer.toLowerCase());
        System.out.println(answer.toUpperCase());
        System.out.println(length);
        for (int i = 0; i < length; i++){
            System.out.println(answer.charAt(i));
        }
    }
}