/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class represents an Auto insurance policy.
 */

public class Auto {
	private String firstName;
	private String lastName;
	private String make;
	private String model;
	private double liability;
	private double collision;
	private double commission;
	
	// Default Auto policy constructor
	public Auto() {}
	
	/**
	 * Auto policy constructor with parameters
	 * 
	 * @param firstName The first name of the Auto policy holder.
	 * @param lastName The last name of the Auto policy holder.
	 * @param make The make of the car.
	 * @param model The model of the car.
	 * @param liability The amount of liability coverage in dollars.
	 * @param collision The amount of collision coverage in dollars.
	 */
	
	public Auto(String firstName, String lastName, String make, String model, double liability, double collision) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.make = make;
		this.model = model;
		this.liability = liability;
		this.collision = collision;
	} 
	
	// Calculates commission for Auto policy
	public void computeCommission() {
		commission = (liability + collision) * 0.3;
	} 
	
	// Getters and Setters
	public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getLiability() { return liability; }
    public void setLiability(double liability) { this.liability = liability; }

    public double getCollision() { return collision; }
    public void setCollision(double collision) { this.collision = collision; }

    public double getCommission() { return commission; }
    public void setCommission(double commission) { this.commission = commission; }

    // Returns a formatted string for Auto policy
	@Override
	public String toString() {
		return "\nAuto Policy\n-----------" +
				"\nName: " + firstName + " " + lastName +
				"\nMake: " + make +
				"\nModel: " + model +
				"\nLiability: $" + String.format("%,.2f", liability) +
				"\nCollision: $" +  String.format("%,.2f", collision) +
				"\nCommission: $" +  String.format("%,.2f", commission);
	} 
} 
