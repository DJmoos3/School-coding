import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Välj ett nummer");
        answer = sc.nextInt();
        if (answer % 3 == 0 && answer % 5 == 0){

            System.out.println("FizzBuzz");

        }
        else if(answer % 3 == 0){
            System.out.println("Fizz");
        }
        else if (answer % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("YOU GET NOTHING!");
        }
    }
}