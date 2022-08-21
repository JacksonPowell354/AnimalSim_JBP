package AnimalSim_JBP.copy;
/**
 * This class is used as a simulation map to determine the coordinates of animals
 * @author Jackson Powell
 * Final Programming Project for CS 131ON
  * Location.java
 */

public class Location {
	
	protected int xCoord;//x coordinate
	protected int yCoord;//y coordinate

	//Empty argument constructor
	public Location() {
		
		xCoord = 0;
		yCoord = 0;
		
	}//end empty argument constructor

	/**
	 * preferred argument constructor
	 * @param xCoord
	 * @param yCoord
	 */
public Location(int xCoord, int yCoord) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}//end preferred argument constructor

	/**
	 * @param x
	 * @param y
	 */
public void update(int x, int y) {
		
		xCoord = x;
		yCoord = y;
		
	}//end update

	/**
	 * get coordinates to return an integer for x and y
	 * @return
	 */
	public int[] getCoordinates() {
    
		return new int[] {xCoord, yCoord};
	}//end getCoordinates
	
	public void setCoords(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}//end setCoords

	/**
	 * clone to call in the main so it doesn't get confused
	 */
public Location clone() {
		
		return new Location(this.xCoord, this.yCoord);
		
	}//end clone

	/**
	 * toString to print in the main
	 */
@Override
public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	

}//end class