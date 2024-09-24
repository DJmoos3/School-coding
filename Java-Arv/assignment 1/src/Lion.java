public class Lion extends Animal
{
    Lion(String name)
    {
        super(name);
    }
    public void roar()
    {
        System.out.println(getName() + ": rawr");
    }
}
