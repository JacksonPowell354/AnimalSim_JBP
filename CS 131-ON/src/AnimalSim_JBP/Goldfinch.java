package AnimalSim_JBP;

/**
 * This class is used as a subclass to animal, using the super class to add the animal class
 * @author Jackson Powell
 * Final Project
 * CS131ON
 * Goldfinch.java
 */
public class Goldfinch extends Animal implements Flyable, Walkable{
protected double wingSpan;

public Goldfinch() {
	this.simID=0;
	this.l=this.l;
	this.full=false;
	this.rested=true;
	this.wingSpan=9.0;
}//end Goldfinch

public Goldfinch(int simID, Location l, double ws) {
	this.wingSpan=ws;
	this.l=l;
	this.simID=simID;
	this.full=false;
	this.rested=true;
}//end Goldfinch

public double getWingSpan() {
	return wingSpan;
}//end getWingSpan

public void setWingSpan(double wingSpan) {
	this.wingSpan = wingSpan;
}//end setWingSpan

public String toString() {
	return "{SimID: " + this.simID + ", Location: [" +this.l.xCoord + ", " + this.l.yCoord +"], Full: " + this.full +", Rested: " + this.rested + ", Wingspan: " + this.wingSpan + "}";
}//end toString

public void walk(int direction) {
int north = 1;
int east = 2;
int south = 3;
int west = 4;
if(direction == north) {
	this.l.yCoord=this.l.yCoord+=1;
}
else if(direction == east) {
	this.l.xCoord=this.l.xCoord+=1;
}
else if(direction == south) {
	this.l.yCoord=this.l.yCoord-=1;
}
else if(direction == west) {
	this.l.xCoord=this.l.xCoord-=1;
}
else {
	System.out.println("1 for North, 2 for East, 3 for South, 4 for West");
}
}//end walk

public void fly(Location l) {
	this.l=l;
}//end fly
}