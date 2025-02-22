/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class represents a Home insurance policy.
 */

public class Home {
	private String firstName;
	private String lastName;
	private int footage;
	private double dwelling;
	private double contents;
	private double liability;
	private double commission;
	
	// Default Home policy constructor
	public Home() {}
	
	/**
	 * Home policy constructor with parameters
	 * 
	 * @param firstName The first name of the Home policy holder.
	 * @param lastName The last name of the Home policy holder.
	 * @param footage The square footage of the Home.
	 * @param dwelling The amount of dwelling coverage in dollars.
	 * @param contents The amount of contents coverage in dollars.
	 * @param liability The amount of liability coverage in dollars.
	 */
	
	public Home(String firstName, String lastName, int footage, double dwelling, double contents, double liability) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.footage = footage;
		this.dwelling = dwelling;
		this.contents = contents;
		this.liability = liability;
	} 
	
	// Calculates commission for Home policy 
	public void computeCommission() {
		commission = (liability * 0.3) + ((dwelling + contents) * 0.2);
	}

	// Getters and Setters
	public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getFootage() { return footage; }
    public void setFootage(int footage) { this.footage = footage; }

    public double getDwelling() { return dwelling; }
    public void setDwelling(double dwelling) { this.dwelling = dwelling; }

    public double getContents() { return contents; }
    public void setContents(double contents) { this.contents = contents; }

    public double getLiability() { return liability; }
    public void setLiability(double liability) { this.liability = liability; }

    public double getCommission() { return commission; }
    public void setCommission(double commission) { this.commission = commission; }
	
    // Returns a formatted string for Home policy
	@Override
	public String toString() {
		return "\nHome Policy\n-----------" +
				"\nName: " + firstName + " " + lastName +
				"\nFootage: " + footage + 
				"\nDwelling: $" + String.format("%,.2f", dwelling) + 
				"\nContents: $" + String.format("%,.2f", contents) + 
				"\nLiability: $" + String.format("%,.2f", liability) + 
				"\nCommission: $" + String.format("%,.2f", commission);
	}
}
