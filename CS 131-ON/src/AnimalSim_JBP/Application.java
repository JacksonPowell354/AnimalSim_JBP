package AnimalSim_JBP;

import java.util.*;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**************************************
	      Location Tests
	      
***************************************/
Location loc1 = new Location();
Location loc2 = new Location(88,22);
System.out.println("**************************************\r\n"
		+ "	      Location Tests\r\n"
		+ "	      \r\n"
		+ "***************************************\r\nLocation 1: " + Arrays.toString(loc1.getCoordinates()));
loc1.update(1, 2);
System.out.println("Location 2: " + Arrays.toString(loc2.getCoordinates()));
System.out.println("Location 1: " + Arrays.toString(loc1.getCoordinates()));


/*************************************
Goldfinch Tests
**************************************/


Goldfinch gold = new Goldfinch(4, loc1, 2.1); //preferred constructor
System.out.println("**************************************\r\n"
		+ "	      Goldfinch Tests\r\n"
		+ "	      \r\n"
		+ "***************************************\r\nGoldfinch Testing: " + gold.toString()); 


gold.setWingSpan(5.6);
System.out.println("Goldfinch Testing: " + gold.getWingSpan()); 


gold.walk(14); 
System.out.println("Goldfinch Testing: " + gold.toString()); 
gold.fly(loc1);
System.out.println("Goldfinch Testing: " + gold.toString());


gold.setSimID(1); 
System.out.println("Goldfinch Testing: " + gold.getSimID()); //simId

gold.setIsRested(true); 
System.out.println("Goldfinch Testing: " + gold.getIsRested()); //getRested
gold.setLocation(loc1); 
System.out.println("Goldfinch Testing: " + gold.getLocation());//loc


gold.setIsFull(false); 
System.out.println("Goldfinch Testing: " + gold.getIsFull()); //getFull 



System.out.println("Goldfinch Testing: " + gold.sleep()); //sleep 
System.out.println("Goldfinch Testing: " + gold.eat()); //eat



/*********************************************
BrownBear Tests
*********************************************/
BrownBear b0 = new BrownBear(); //empty constructor test
BrownBear b1 = new BrownBear(2, loc1, "Moon"); //preferred constructor test
System.out.println("**************************************\r\n"
		+ "	      BrownBear Tests\r\n"
		+ "	      \r\n"
		+ "***************************************\r\nBrownBear Testing: " + b1.toString()); //toString test


b1.setSimID(11); //setSimID test
System.out.println("BrownBear Testing: " + b1.getSimID());//getSimID test


b1.setLocation(loc1); //setLocation test
System.out.println("BrownBear Testing: " + b1.getLocation());//getLocation test


b1.setFull(true); //setFull test
System.out.println("BrownBear Testing: " + b1.getIsFull()); //getFull test

b1.setRested(false); //setRested test
System.out.println("BrownBear Testing: " + b1.getIsRested()); //getRested test


System.out.println("BrownBear Testing: " + b1.eat()); //eat test
System.out.println("BrownBear Testing: " + b1.sleep()); //sleep test


b1.walk(44); //walk 
System.out.println("BrownBear Testing: " + b1.toString()); 

b1.swim(12); //swim 
System.out.println("BrownBear Testing: " + b1.toString()); 


b1.setSubSpecies("Alaskan"); //setSubSpecies test
System.out.println("BrownBear Testing: " + b1.getSubSpecies()); 
/**************************
Generics Test
***************************/
Location finchloc1 = new Location(14,77);
Location finchloc2 = new Location(2,56);

Location bloc1 = new Location(21,34);
Location bloc2 = new Location(381,12);

ArrayList<Animal> animals = new ArrayList<Animal>();


Goldfinch gold1 = new Goldfinch(2, finchloc1, 7.21);

Goldfinch gold2 = new Goldfinch(3, finchloc2, 4.89);
BrownBear bear1 = new BrownBear(1, bloc1, "Black Bear");

BrownBear bear2 = new BrownBear(4, bloc2, "Moonbear");

animals.add(bear1);
animals.add(bear2);
animals.add(gold1);


animals.add(gold2);
for(int i = 0;i<animals.size();i++) {
	System.out.println("**************************************\r\n"
			+ "	      Generics Tests\r\n"
			+ "	      \r\n"
			+ "***************************************\r\nGeneric testing phase: " + animals.get(i).toString());
}//end genericsTesting


	}//emd main
}//end class
