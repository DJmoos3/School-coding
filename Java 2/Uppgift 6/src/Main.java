import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int checkNr;
        int totalNr = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv ditt personnummer i 10 siffror");
        String persNr = sc.nextLine();

        for(int i = 0; i < 10; ++i) {
            if (i % 2 == 0) {
                checkNr = Character.getNumericValue(persNr.charAt(i));
                checkNr *= 2;
                if (checkNr >= 10) {
                    int curNr = checkNr / 10;
                    checkNr = checkNr % 10;
                    totalNr = totalNr + curNr + checkNr;
                } else {
                    totalNr = totalNr + checkNr;
                }
            } else {
                checkNr = Character.getNumericValue(persNr.charAt(i));
                totalNr = totalNr + checkNr;
            }
        }

        if (totalNr % 10 == 0) {
            System.out.println("Personnumret är giltigt");
        } else {
            System.out.println("Personnumret är ogiltigt");
        }

    }
}
