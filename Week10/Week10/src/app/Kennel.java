package app;

import pets.Cat;
import pets.Dog;
import pets.Pet;

public class Kennel
{
    private Pet[] pets = new Dog[11];

    public Kennel()
    {
        seedData();
    }

    private void seedData()
    {
        pets = new Pet[11];
        Dog thai = new Dog("Thai", 5);
        Dog cain = new Dog("Cain", 5);
        Dog fido = new Dog("Fido", 15);
        Dog youngFido = new Dog("Fido", 5);
        Dog roger = new Dog("Roger", 7);
        Dog scooby = new Dog("Scooby", 8);

        Cat toby = new Cat("Toby", 10);
        Cat youngToby = new Cat("Toby", 1);
        Cat pipa = new Cat("Pipa", 5);
        Cat brushy = new Cat("Brushy", 15);
        Cat lila = new Cat("Lila", 7);

        pets[0] = thai;
        pets[1] = cain;
        pets[2] = fido;
        pets[3] = roger;
        pets[4] = scooby;

        pets[5] = youngToby;
        pets[6] = pipa;
        pets[7] = brushy;
        pets[8] = lila;
        pets[9] = youngFido;
        pets[10] = toby;
    }
    
    public Pet[] filteredPets(String petType)
    {
    	int filterSize = 0;
    	int filteredPetIndex = 0;
    	
    	for(int i = 0; i < pets.length; i++)
    	{
			if (petType.equals("D") && pets[i] instanceof Dog ||
				petType.equals("C") && pets[i] instanceof Cat)
			{
				filterSize++;
			}
    	}
    	
    	Pet[] filteredPets = new Pet[filterSize];
    	
    	for(int i = 0; i < pets.length; i++)
    	{
    		if (petType.equals("D") && pets[i] instanceof Dog ||
				petType.equals("C") && pets[i] instanceof Cat)
			{
				filteredPets[filteredPetIndex] = pets[i];
				filteredPetIndex++;	
			}
    	}
    	return filteredPets;
    }
    
    //i changed pets array to filteredPets (returned from filtered method)
    public void sort(String sortOrder, Pet[] filteredPets)
    {
    	boolean bubbleOccured = true;
    	
    	while(bubbleOccured)
    	{
    		bubbleOccured = false;
    		for(int i = 0; i < filteredPets.length; i++)
        	{
    			// while the next Pet's index is within bounds 
    			while(i+1 < filteredPets.length - 1)
    			{
    				Pet a = filteredPets[i];
        	    	Pet b = filteredPets[i + 1];
        	    	
            		if (sortOrder.equals("A") && a.getName().compareTo(b.getName()) > 0 ||
            			sortOrder.equals("D") && a.getName().compareTo(b.getName()) < 0)
        			{
            			filteredPets[i] = b;
            			filteredPets[i + 1] = a;
            			
            			bubbleOccured = true;
        			}
    			}
        	}
    	}
    }
    
    //filter and sort
    public Pet[] filterAndSort(String petType, String sortOrder)
    {
    	Pet[] filteredPets = filteredPets(petType);
    	sort(sortOrder, filteredPets);  //parameters sortOrder "A" or "D", and total pets array 
    	
    	return filteredPets;
    }
    
}
