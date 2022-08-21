package AnimalSim_JBP;

/**
 * This class is used as a subclass to animal, using the super class to add the animal class
 * instance variables to give all the right variables for a BrownBear
 * @author Jackson Powell
 * Final Programming Project
 * CS131ON
 * BrownBear.java
 */

public class BrownBear extends Animal implements Walkable, Swimmable
{

	private String subSpecies;
	
	/**
	 * empty argument constructor
	 */
	public BrownBear(){
		
		super();
		subSpecies = "Alaskan";
    }//end empty argument constructor

	/**
	 * preferred argument constructor
	 */
    public BrownBear(int simID, Location l, String subSpecies) {
            
    	super(simID, l);
        this.subSpecies = subSpecies;
    }//end preferred argument constructor

    /**
	 * getters and setters for SubSpecies, simID, location, full, and rested
	 */
    public String getSubSpecies() {
        return subSpecies;
    }//end getSubSpecies

    public void setSubSpecies(String subSpecies) {
        this.subSpecies = subSpecies;
    }//end setSubSpecies

    public int getSimID() {
        return simID;
    }//end getSimID

    public void setSimID(int simID) {
        this.simID = simID;
    }//end setSimID

    public Location getLocation() {
        return l;
    }//end getLocation

    public void setLocation(Location location) {
        this.l = location;
    }//end setLocation

    public boolean isFull() {
        return full;
    }//end isFull

    public void setFull(boolean full) {
        this.full = full;
    }//end setFull

    public boolean isRested() {
        return rested;
    }//end isRested

    public void setRested(boolean rested) {
        this.rested = rested;
    }//end setRested
    
    
    /**
     * implementation of the walkable interface
     */
    public void walkUp() {
		yCoord++;
		
	}

	public void walkDown() {
		yCoord--;
		
	}


	public void walkLeft() {
		xCoord--;
		
	}

	public void walkRight() {
		xCoord++;
		
	}
	
	/**
	 * implementation of the swimmable interface
	 */
	public void swimLeft() {
		xCoord--;
		
	}

	public void swimRight() {
		xCoord++;
		
	}
	
	public void swimUp() {
		yCoord++;
		
	}

	public void swimDown() {
		yCoord--;
		
	}

	/**
	 * toString to print in the main
	 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + l + ", full=" + full
				+ ", rested= "+ rested +"]";
	}//end toString

	@Override
	public void swim(int direction) {
		// TODO Auto-generated method stub
		int north = 1;
		int east = 2;
		int south = 3;
		int west = 4;
		if(direction == north) {
			this.l.yCoord=this.l.yCoord+=2;
		}
		else if(direction == east) {
			this.l.xCoord=this.l.xCoord+=2;
		}
		else if(direction == south) {
			this.l.yCoord=this.l.yCoord-=2;
		}
		else if(direction == west) {
			this.l.xCoord=this.l.xCoord-=2;
		}
		else {
			System.out.println("1 for North, 2 for East, 3 for South, 4 for West");
		}
		}//end swim	
	

	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		int north = 1;
		int east = 2;
		int south = 3;
		int west = 4;
		if(direction == north) {
			this.l.yCoord=this.l.yCoord+=3;
		}
		else if(direction == east) {
			this.l.xCoord=this.l.xCoord+=3;
		}
		else if(direction == south) {
			this.l.yCoord=this.l.yCoord-=3;
		}
		else if(direction == west) {
			this.l.xCoord=this.l.xCoord-=3;
		}
		else {
			System.out.println("1 for North, 2 for East, 3 for South, 4 for West");
		}
		}//end walk
	
    
}//end class