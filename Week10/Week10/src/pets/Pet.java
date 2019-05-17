package pets;

public class Pet
{
    private String name;
    private int age;

    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getDetails()
    {
        String details = "";
        details += String.format("\n\n%-15s%s", "Name:", name) + "\n";
        details += String.format("%-15s%s", "Age", age);
        return details;
    }

    public String getName()
    {
        return name;
    }
    
    
}
