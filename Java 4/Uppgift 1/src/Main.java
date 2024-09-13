import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Integer> points = new ArrayList<>();
        ArrayList<String> user = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Boolean moreInput = true;
        String input;
        int currentScorer = 0;
        int totalScore = 0;
        int averageScore = 0;
        int highScore = 0;

        System.out.println("Who played in today's game? write done when you're finished.");
        while (moreInput)
        {
            input = sc.nextLine();
            if(!input.equalsIgnoreCase("done"))
            {
                user.add(input);
            }
            else
            {
                moreInput = false;
            }
        }

        System.out.println("What score did everyone get?");
        for (int i = 0; i  < user.size(); i++)
        {
            points.add(sc.nextInt());
            sc.nextLine();
        }

        highScore += points.get(0);

        for (int i = 1; i  < user.size(); i++)
        {
            if (points.get(i - 1) < points.get(i))
            {
                currentScorer = i;
                highScore = points.get(i);
            }
        }

        for (int i = 0; i  < user.size(); i++)
        {
           totalScore += points.get(i);
        }
        averageScore = totalScore / points.size();

        System.out.println("The average score was: " + averageScore + " while " + user.get(currentScorer) + " had the " +
                "highest score of: " + highScore );

    }
}