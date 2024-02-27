/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Give details about a patient and their procedure
 * Due: 2/27/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sakash Khanna
*/

public class PatientDriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MY_NAME="Sakash Khanna";
		final String MC_ID="M20855901";
		final String DUE_DATE="2/27/2024";
		
		//creating patient
		Patient p1 = new Patient();
		p1.setFirstName("Jenny");
		p1.setMiddleName("Elaine");
		p1.setLastName("Santori");
		p1.setStreetAddress("123 Main Street");
		p1.setCity("MyTown");
		p1.setState("CA");
		p1.setZipCode("01234");
		p1.setEmergencyName("Bill Santori");
		p1.setEmergencyPhoneNumber("777-555-1212");
		
		//display patient information
		System.out.println("Patient info: ");
		displayPatient(p1);
		
		//creating procedure 1
		Procedure num1 = new Procedure("Physical Exam", "7/20/2019");
		num1.setProcedurePractitioner("Dr. Irvine");
		num1.setProcedureCost(3250.0);
		
		//creating procedure 2
		Procedure num2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5500.43);
		
		//creating procedure 3
		Procedure num3 = new Procedure();
		num3.setProcedureName("Blood Test");
		num3.setProcedureDate("7/20/2019");
		num3.setProcedurePractitioner("Dr. Smith");
		num3.setProcedureCost(1400.75);
		
		//display Procedures
		displayProcedure(num1);
		displayProcedure(num2);
		displayProcedure(num3);
		
		//display cost
		System.out.println("\nTotal Charges: $" + calculateTotalCharges(num1, num2, num3));
		
		//Display Personal information
		System.out.println("\nStudent Name: " + MY_NAME);
		System.out.println("MC# " + MC_ID);
		System.out.println("Due Date: " + DUE_DATE);
		
		
		
		
	}
	/**
	 * 
	 * @param p1 displays Patient p1
	 */
	public static void displayPatient(Patient p1) {
		System.out.println(p1 + "\n");
	}
	/**
	 * 
	 * @param p1 displays Procedure p1
	 */
	public static void displayProcedure(Procedure p1) {
		System.out.println(p1 + "\n");
	}
	
	/**
	 * 
	 * @param num1 procedure cost of num1
	 * @param num2 procedure cost of num2
	 * @param num3 procedure cost of num3
	 * @return sum of num1, num2, num3
	 */
	public static double calculateTotalCharges(Procedure num1,Procedure num2, Procedure num3) {//what is given ?
		return num1.getProcedureCost()+num2.getProcedureCost()+num3.getProcedureCost();
	}
}