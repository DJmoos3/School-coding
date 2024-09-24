//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Lion l1 = new Lion("Scar");
        Hyena h1 = new Hyena("Shenzi");
        Hyena h2 = new Hyena("Banzai");
        Hyena h3 = new Hyena("Ed");

        l1.eat("Pumba");
        h1.eat("Pumba");
        h2.eat("Pumba");
        h3.eat("Pumba");
        l1.roar();
        h1.laugh();
        h2.laugh();
        h3.laugh();
    }
}