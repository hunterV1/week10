package pets;

public class Dog extends Pet
{
    private boolean isBarking;

    public Dog(String name, int age)
    {
        super(name, age);
        isBarking = false;
    }

    public String getDetails()
    {
        String details = "";
        details += super.getDetails();
        details += String.format("\n%-15s%s", "Is Barking:", isBarking) + "\n";
        return details;
    }
}
