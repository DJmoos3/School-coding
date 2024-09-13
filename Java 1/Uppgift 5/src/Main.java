import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean logIn;
        String answer;
        Scanner sc = new Scanner(System.in);

        System.out.println("Är användaren inloggad?");
        answer = sc.nextLine();

        if(answer.equals("ja")){
            logIn = true;
        }
        else {
            logIn = false;
        }

        if (logIn){
            System.out.println("Betalar användaren för tjänsten?");
            answer = sc.nextLine();
            if (answer.equals("ja")){
                System.out.println("Användaren är både inloggad och betalar för tjänsten.");
            }
            else {
                System.out.println("Användaren är inloggad men betalar inte för tjänsten");
            }


        }
        else {
            System.out.println("Betalar användaren för tjänsten?");
            answer = sc.nextLine();
            if(answer.equals("ja")) {
                System.out.println("Användaren betlar för tjänsten men är inte inloggad");
            }
            else{
                System.out.println("Användaren är varken inloggad eller betalar för tjänsten");
            }
        }
    }
}