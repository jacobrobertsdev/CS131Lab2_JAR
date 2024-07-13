
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	
	public Wizard() {
		this.setName("");
		this.setHealth(100);
		this.key = 0;
		this.locked = false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	
	public Wizard(String name) {
		this.setName(name);
		this.setHealth(100);
		this.key = 0;
		this.locked = false;
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	
	public void takeDamage(int power) {
		if (!this.isLocked()) {
			this.health -= power;
		} else {
			System.out.println(this.name + " is Locked.");
		}
		
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
	return this.name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	
	public void setName(String name) {
	this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	
	public int getHealth() {
	return this.health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	
	public int getKey() {
		return this.key;
	}//end getKey

	// Setter for key
	public void setKey(int key) {
		if (this.key == 0 && key > 0){
			this.key = key;
		} else {
			System.out.println("Invalid key (must be > 0), or key already exists. " + this.key);
			return;
		}
	}// end setKey

	// Get isLocked
	public boolean isLocked() {
		return this.locked;
	}// end isLocked
	
	// Lock implementation
	public void lock(int key) {
		if(this.key == key) {
			this.locked = true;
		} else {
			System.out.println("Key does not match. Key is: " + this.key);
		}
	}// end lock
	
	// Unlock implementation
	public void unlock(int key) {
		if(this.key == key) {
			this.locked = false;
		} else {
			System.out.println("Key does not match. Key is: " + this.key);
		}
	}// end unlock


	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class