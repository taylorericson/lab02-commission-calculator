/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class represents a Life insurance policy.
 */

public class Life {
	private String firstName;
	private String lastName;
	private int age;
	private double term;
	private double commission;
	
	// Default Life policy constructor
	public Life() {};
	
	/**
	 * Life policy constructor with parameters
	 * 
	 * @param firstName The first name of the Life policy holder.
	 * @param lastName The last name of the Life policy holder.
	 * @param age The age of the Life policy holder.
	 * @param term The amount of term life coverage in dollars.
	 */
	
	public Life(String firstName, String lastName, int age, double term) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.term = term;
	}
	
	// Calculates commission for Life policy
	public void computeCommission() {
		commission = term * .2;
	}
	
	// Getters and Setters
	public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getTerm() { return term; }
    public void setTerm(double term) { this.term = term; }

    public double getCommission() { return commission; }
    public void setCommission(double commission) { this.commission = commission; }
    
    // Returns a formatted string for Life policy
    @Override
    public String toString() {
    	return "\nLife Policy\n-----------" + 
    			"\nName: " + firstName + " " + lastName +
    			"\nAge: " + age +
    			"\nTerm: $" + String.format("%,.2f", term) +
    			"\nCommission: $" + String.format("%,.2f", commission);
    }
}