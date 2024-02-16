/**
 * Creates a patient object
 * @author dungtruong
 * @param patientID holds the patient ID
 * @param patientAge holds the patient’s age
 * @param firstName holds the patient’s first name
 * @param lastName holds the patient’s last name
 * @param patientAllergy holds the patient’s allergy type
 */
import java.util.*;
public class Patient implements Comparable<Patient>
{
	 private int patientID; 
	 private String firstName; 
	 private String lastName;
	 private int patientAge; 
	 private String patientAllergy;
	 
	  
	//constructor
	
	 public Patient(int id, String fName,String lName, int age, String algy)
	{
		 super();
		patientID =id;
		firstName = fName;
		lastName = lName;
		patientAge = age;
		patientAllergy = algy;
	}

	
	 public String toString()
	{
		return "\n- Patient ID: "+patientID +"\n- First name: "+firstName +"\n- Last name: "+lastName+"\n- Age: "+patientAge+"\n- Allergy: "+patientAllergy+"\n";
		
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getpatientAllergy() {
		return patientAllergy;
	}
	public void setpatientAllergy(String allergy) {
		this.patientAllergy = allergy;
	}
	 public int compareTo(Patient another)//comparator
	 {
		 return this.patientAge - another.getPatientAge();
	 }
	
}
