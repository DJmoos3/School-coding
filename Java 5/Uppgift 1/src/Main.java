
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(1, 2);
        Rectangle rectangle3 = new Rectangle(4,3,2,1);

        System.out.println("rectangle 1: " + rectangle1.x + rectangle1.y + rectangle1.width + rectangle1.height);
        System.out.println("rectangle 2: " + rectangle2.calculatePerimiter());
        System.out.println("rectangle 3: " + rectangle3.calculatePerimiter() + " " + rectangle3.calculateArea());
    }
}
