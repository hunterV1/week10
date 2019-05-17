package pets;

public class Cat extends Pet
{
    private boolean isPurring;

    public Cat(String name, int age)
    {
        super(name, age);
        isPurring = false;
    }

    public String getDetails()
    {
        String details = "";
        details += super.getDetails();
        details += String.format("\n%-15s%s", "Is Purring:", isPurring) + "\n";
        return details;
    }
}
