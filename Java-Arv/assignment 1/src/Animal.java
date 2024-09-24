public class Animal
{
    private String name;
    Animal(String name)
    {
        setName(name);
    }
    public void eat(String food)
    {
        System.out.println(getName() + " is eating " + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
