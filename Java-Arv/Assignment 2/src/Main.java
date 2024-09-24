//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(5,10);
        Triangle t1 = new Triangle(5, 10);

        t1.getArea(2);
        r1.getArea(1);

        System.out.println(t1.getArea(2));
        System.out.println(r1.getArea(1));
    }
}