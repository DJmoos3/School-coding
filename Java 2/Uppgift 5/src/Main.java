import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int guess;
        String diffi;
        int turns = 1;
        Random rand = new Random();
        int easy = rand.nextInt(10) + 1;
        int medium = rand.nextInt(100) + 1;
        int hard = rand.nextInt(1000) + 1;
        Scanner sc = new Scanner(System.in);
        boolean rightNr = false;

        System.out.println("Vilken svårighetsgrad vill du spela på? \nEasy = 1-10 \nMedium = 1-100 \nHard 1-1000");
        diffi = sc.nextLine();
        if (diffi.equals("Easy") || diffi.equals("easy")){
            while(!rightNr && turns <= 3) {
                System.out.println("Vilket nummer tänker jag på? ");
                guess = sc.nextInt();
                if (guess == easy){
                    System.out.println("Rätt svar! Du vann!!!");
                    rightNr = true;
                }
                else if (guess < easy){
                    System.out.println("Högre");
                }
                else{
                    System.out.println("Lägre");
                }

                turns++;
            }
        }
        if (diffi.equals("Medium") || diffi.equals("medium")){
            while(!rightNr && turns <= 3) {
                System.out.println("Vilket nummer tänker jag på? ");
                guess = sc.nextInt();
                if (guess == medium){
                    System.out.println("Rätt svar! Du vann!!!");
                    rightNr = true;
                }
                else if (guess < medium){
                    System.out.println("Högre");
                }
                else{
                    System.out.println("Lägre");
                }
                turns++;
            }
        }
        if (diffi.equals("Hard") || diffi.equals("hard")){
            while(!rightNr && turns <= 3) {
                System.out.println("Vilket nummer tänker jag på? ");
                guess = sc.nextInt();
                if (guess == hard){
                    System.out.println("Rätt svar! Du vann!!!");
                    rightNr = true;
                }
                else if (guess < hard){
                    System.out.println("Högre");
                }
                else{
                    System.out.println("Lägre");
                }
                turns++;
            }
        }
        if (!rightNr){
            System.out.println("Du förlorade");
        }
    }
}