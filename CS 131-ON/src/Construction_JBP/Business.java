package Construction_JBP;

public class Business extends Building{
	//instance variable - visibility is protected so subclasses can manipulate the data directly.

	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits = 0;
	}//end empty constructor
	/**
	 *  The preferred argument constructor generates the specifications for a business
	 */
	public Business(String projectName,String completeAddress, double totalSquareFeet,String occupancyGroup,String subGroup,int numRentableUnits) {
		super(projectName,completeAddress, totalSquareFeet, occupancyGroup,subGroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor
	/**
	 *  Getter and Setter
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	/**
	 * ToString outputs the number of rentable units
	 */
	public String toString() {
		return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
		}//end toString
	
	
}//end class
