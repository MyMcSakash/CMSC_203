/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Give and take details about a patient
 * Due: 2/27/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sakash Khanna
*/


public class Patient {
	
	private String firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyName, emergencyPhoneNumber;
	
	//a no-arg constructor
	public Patient() {
		firstName=null;
		middleName=null;
		lastName=null;
		streetAddress=null;
		city=null;
		state=null;
		zipCode=null;
		phoneNumber=null;
		emergencyName=null;
		emergencyPhoneNumber=null;
	}
	// a parameterized constructor that initializes patient’s first, middle and last name to the given values
	
	/**
	 * 
	 * @param firstName the firstName of patient
	 * @param middleName the middleName of patient
	 * @param lastName the lastName of patient
	 */
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
	}
	
	//a parameterized constructor that initializes all attributes of the patient to the given values
	/**
	 * 
	 * @param firstName the firstName of patient
	 * @param middleName the middleName of patient
	 * @param lastName the lastName of patient
	 * @param streetAddress the streetAddress of patient
	 * @param city the city of patient
	 * @param state the state of patient
	 * @param zipCode the zipCode of patient
	 * @param phoneNumber the phoneNumber of patient
	 * @param emergencyName the emergencyName of patient
	 * @param emergencyPhoneNumber the emergencyPhoneNumber of patient
	 */
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyName, String emergencyPhoneNumber) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.streetAddress=streetAddress;
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
		this.phoneNumber=phoneNumber;
		this.emergencyName=emergencyName;
		this.emergencyPhoneNumber=emergencyPhoneNumber;
	}
	
	//firstName
	/**
	 * 
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * 
	 * @param firstName set firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//middleName
	/**
	 * 
	 * @return String Middle Name
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * 
	 * @param middleName set MiddleName
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	//lastName
	/**
	 * 
	 * @return String Last Name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * 
	 * @param lastName set LastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//streetAddress
	/**
	 * 
	 * @return String Street Address
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	
	/**
	 * 
	 * @param streetAddress set StreetAddress
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	//city
	/**
	 * 
	 * @return String City
	 */
	public String getCity() {
		return city;
	}
		
	/**
	 * 
	 * @param city set City
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	//state
	/**
	 * 
	 * @return String State
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * 
	 * @param state set State
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	//zipCode
	/**
	 * 
	 * @return String ZipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * 
	 * @param zipCode set ZipCode
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	//phoneNumber
	/**
	 * 
	 * @return String Phone Number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * 
	 * @param phoneNumber set PhoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
	//emergencyName
	/**
	 * 
	 * @return String Emergency Name
	 */
	public String getEmergencyName() {
		return emergencyName;
	}
	/**
	 * 	
	 * @param emergencyName set Emergency Name
	 */
	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}	
	
	//emergencyPhoneNumber
	/**
	 * 
	 * @return String Emergency Phone Number
	 */
	public String getEmergencyPhoneNumber() {
		return emergencyPhoneNumber;
	}
	
	/**
	 * 
	 * @param emergencyPhoneNumber set Emergency Phone Number
	 */
	public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
	
	/**
	 * 
	 * @return full name
	 */
	public String buildFullName() {
		return getFirstName()+" " + getMiddleName() + " " + getLastName();
	}// buildFullName
	
	/**
	 * 
	 * @return full address
	 */
	public String buildAddress() {
		return getStreetAddress() + " " + getCity() + " " + getState() + " " + getZipCode();
	}// buildAddress
	
	/**
	 * 
	 * @return full emergency Contact
	 */
	public String buildEmergencyContact() {
		return getEmergencyName()+ " " + getEmergencyPhoneNumber();
	}// buildEmergencyContact
	
	/**
	 * returns all details combined
	 */
	public String toString() {
		return "  Name: " + buildFullName() + "\n  Address: " + buildAddress() + "\n  EmergencyContact: " + buildEmergencyContact();
	}// toString
	
	
}//patient class

