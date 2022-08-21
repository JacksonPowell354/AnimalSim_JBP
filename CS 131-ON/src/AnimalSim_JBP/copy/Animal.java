package AnimalSim_JBP.copy;

/**
 * This class is used as a parent to support all other animal subclasses
 * @author Jackson Powell
 * Final Programming Project
 * CS131ON
 * Animal.java
 */
public abstract class Animal extends Location{
    
	protected int simID; //simID for the animal
	protected Location l;//coordinates for the animal
	protected boolean full;// whether or not the animal is full
	protected boolean rested;// whether or not the animal is rested

	/**
	 * empty argument constructor
	 */
    public Animal() {
    	
        this.simID = 0;
        this.l = new Location(0,0);
        this.full = false;
        this.rested = true;
        
    }//end empty argument constructor

    /**
	 * preferred argument constructor
	 */
    public Animal(int simID, Location l) {
    	
        this.simID = simID;
        this.l = l;
        full = false;
        rested = true;
        
    }//end preferred argument constructor

    /**
     * getters and setters for simID, location, full, and rested
     * @return
     */
    public int getSimID() {
    	
        return simID;
    }//end getSimID

    public void setSimID(int simID) {
    
        this.simID = simID;
    }//end setSimID

    public Location getLocation() {
    	
        return this.l;
    }//end get location

    public void setLocation(Location location) {
    	
        this.l = location;
    }//end setLocation

    public boolean getIsFull() {
    	
        return full;
    }//end getIsFull

    public void setIsFull(boolean full) {
    	
        this.full = full;
    }//end setIsFull

    public boolean getIsRested() {
    	
        return rested;
    }//end getIsResting

    public void setIsRested(boolean rested) {
    	
        this.rested = rested;
    }//end setIsResting

    /**
     * eat tells the full method that the animal has eaten
     * @return
     */
    public boolean eat() {
    	
        double random = Math.random();

        if (random < 0.5) 
        	this.full = false;
        else 
            this.full = true;
        
        return this.full;
    }//end eat

    /**
     * sleep tells the rested method that the animal has slept
     * @return
     */
    public boolean sleep() {
    	
        double random = Math.random();

        if (random < 0.5) 
            this.rested = false;
         else 
            this.rested = true;

        return this.rested;
    }//end sleep

    /**
     * toString to print in the main
     */
	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + l + ", full=" + full + ", rested=" + rested + "]";
	}
    
}//end class