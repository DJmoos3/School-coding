import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int matVara = 0;
        String check;
        boolean done = false;
        String[] matList = new String[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Lägg till varor till matlistan. Max 10 st. Skriv done om du är klar innan 10");
        while (!done)
        {
            check = sc.nextLine();
            if(check.equals("done") || check.equals("Done")){
                System.out.println("Då var vi klara");
                done = true;
            }
            else
            {
                matList[matVara] = check;
                matVara++;
            }
            if(matVara == 10){
                System.out.println("var du klar? Skriv done om du är klar.");
                check = sc.nextLine();
                if(check.equals("done") || check.equals("Done"))
                {
                    System.out.println("Då var vi klara");
                    done = true;
                }
                else
                {
                    System.out.println("Vill du då byta ut en vara?");
                    check = sc.next();
                    sc.nextLine();
                    if (check.equals("Ja") || check.equals("ja"))
                    {
                        while(!done)
                        {
                            System.out.println("Vilken vara vill du byta ut då?");
                            check = sc.next();
                            sc.nextLine();
                            for (int i = 0; i < matVara; i++)
                            {
                                if (check.equals(matList[i]))
                                {
                                    System.out.println("Vad vill du byta varan mot?");
                                    check = sc.next();
                                    sc.nextLine();
                                    matList[i] = check;
                                    done = true;
                                }
                                else if(i == matVara)
                                {
                                    System.out.println("Den varan finns inte");
                                    System.out.println("Skriv done ifall du vill avsluta annars skriv nej");
                                    if(check.equals("done"))
                                    {
                                        done = true;
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Men då var vi klara");
                        done = true;
                    }
                }
            }
        }
        for(int i = 0; i < matVara; i++)
        {
            System.out.println(matList[i]);
        }
        System.out.println("Men då var vi klara");
    }
}