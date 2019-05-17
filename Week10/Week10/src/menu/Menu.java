package menu;

import java.util.Scanner;

import app.Kennel;
import pets.Pet;

public class Menu
{
    private Kennel kennel;

    public Menu()
    {
        kennel = new Kennel();
    }

    public void runMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int response = -1;

        do
        {
            displayMenu();

            while(!scanner.hasNextInt())
            {
                displayMenu();
                System.out.print("Enter selection: ");
            }
            response = Integer.parseInt(scanner.nextLine());

            selectMenuItem(response, scanner);
        } while(response != 0);
    }

    public void selectMenuItem(int response, Scanner scanner)
    {
        switch(response)
        {
            case 0:
                System.out.println("Exiting program.");
                break;
            case 1:
                System.out.println("Please enter sort order (A) or (D)");
                String sortOrder = scanner.nextLine().toUpperCase();
                System.out.println("Please enter pet type (D) or (C)");
                String petType = scanner.nextLine().toUpperCase();
                
                Kennel kennel = new Kennel();
                Pet[] filteredAndSortedArray = kennel.filterAndSort(petType, sortOrder);
                for(int i = 0; i < filteredAndSortedArray.length; i++)
                {
                	System.out.println(filteredAndSortedArray[i]);
                }
                
                System.out.println("You should remove this line when you have implemented your algorithms.");
                break;
            default:
                System.out.println("Invalid selection, please try again.");
        }
    }

    private void displayMenu()
    {
        String menuTitle = "Lycan Kennel - Menu";
        System.out.printf("\n**************************  %S " + "**************************\n\n", menuTitle);

        System.out.println("1. Display Pets");
        System.out.printf("0. Exit\n");
        System.out.println("********************************" + "******************************************\n\n");

        System.out.println("Enter selection: ");
    }
}
