/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Give and take details about a procedure
 * Due: 2/27/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sakash Khanna
*/

public class Procedure {
	private String procedureName, procedureDate, procedurePractitioner;
	private double procedureCost;
	
	// a no-arg constructor
	public Procedure() {
		procedureName=null;
		procedureDate=null;
		procedurePractitioner=null;
		procedureCost=0.0;
	}
	
	// a parameterized constructor that initializes procedure’s name and date to the given values
	/**
	 * 
	 * @param procedureName sets procedureName
	 * @param procedureDate sets procedureDate
	 */
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName=procedureName;
		this.procedureDate= procedureDate;
	}
	
	// a parameterized constructor that initializes all attributes of the procedure to the given values
	/**
	 * 
	 * @param procedureName sets procedureName
	 * @param procedureDate sets procedureDate
	 * @param procedurePractitioner sets procedurePractitioner
	 * @param procedureCost sets procedureCost
	 */
	public Procedure(String procedureName, String procedureDate, String procedurePractitioner, double procedureCost) {
		this.procedureName=procedureName;
		this.procedureDate= procedureDate;
		this.procedurePractitioner = procedurePractitioner;
		this.procedureCost = procedureCost;
	}
	
	//procedureName
	/**
	 * 
	 * @return procedureName
	 */
	public String getProcedureName() {
		return procedureName;
	}
	
	/**
	 * 
	 * @param procedureName sets procedureName
	 */
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	
	//procedureDate
	/**
	 * 
	 * @return procedureDate
	 */
	public String getProcedureDate() {
		return procedureDate;
	}
	
	/**
	 * 
	 * @param procedureDate sets procedureDate
	 */
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	
	//procedurePractitioner
	/**
	 * 
	 * @return procedurePractitioner
	 */
	public String getProcedurePractitioner() {
		return procedurePractitioner;
	}
	
	/**
	 * 
	 * @param procedurePractitioner sets procedurePractitioner
	 */
	public void setProcedurePractitioner(String procedurePractitioner) {
		this.procedurePractitioner = procedurePractitioner;
	}
	
	//procedureCost
	/**
	 * 
	 * @return procedureCost
	 */
	public double getProcedureCost() {
		return procedureCost;
	}
	
	/**
	 * 
	 * @param procedureCost sets procedureCost
	 */
	public void setProcedureCost(double procedureCost) {
		this.procedureCost = procedureCost;
	}
	
	/**
	 * returns total information combined
	 */
	public String toString() {
		return "\tProcedure Name: " + getProcedureName() + "\n\tProcedureDate=" + getProcedureDate() + "\n\tPractitioner=" + getProcedurePractitioner() + "\n\tCharge=" + getProcedureCost();
	}// toString

	
}
	