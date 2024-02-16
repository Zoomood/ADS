/**
 * Displays main menu, take user's input as selection
 * @author fnv512
 * 
 */
import java.util.*;
import java.time.format.*;
import java.time.LocalDate;
public class View {
	
	static ArrayList <Allergy> allergyList;//ArrayList to hold a list of allergy type
	static ArrayList <Vaccine> vaccineList; // ArrayList to hold a list of vaccine name
	static HashMap<Allergy,Vaccine> recVaxForAllergyTable; //HashMap to hold a list of allergies with their recommended vaccines
	static ArrayList<Patient> patientList;// ArrayList to hold a list of patient information
	static ArrayList<Record> hospitalRecord; //ArrayList to hold a list of records
	static HashMap<String,Integer>allergyCount; // HashMap to hold allergy types and number of patients has the allergy
	static HashMap <String,Integer> vaccineCount; //HashMap to hold vaccine types and number of patients that has the vaccine
	static ArrayList<Record> sortedRecord_VaxChoice;//ArrayList to hold record in sorted order (alphabetically) based on the vaccine type
	
	
	public static void main(String[] args)  //store logic of displaying menu
	{
		int menuChoice=1;
		int choiceCase1=0;
		int choiceCase5=0;
		allergyList = createAllergyList();
		vaccineList = createVaccineList();
		recVaxForAllergyTable = recVaxForAllergyTable();
		patientList = new ArrayList<Patient>();
		hospitalRecord = new ArrayList<Record>();
		
		Scanner sc =new Scanner(System.in);
		printMenu(); //display the menu to the user
		
		while (menuChoice>=1||menuChoice<=7)
		{
			try
			{
				menuChoice = sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nInvalid option, enter integer only.\n");
				printMenu();
				sc.next();
				continue;
			}
			switch (menuChoice)
			{
			case 1:
				Record record=null;
				System.out.println("\nAdd patient?\n\t Type 1 to proceed\n\t Type 2 to go back");
				choiceCase1=sc.nextInt();
				while (choiceCase1==1)
				{
					record=createRecordFromUserInput();
					System.out.println("\nAdd another patient?\n\t Type 1 to proceed\n\t Type 2 to go back");
					choiceCase1=sc.nextInt();
					hospitalRecord.add(record);
				}
				if(hospitalRecord.size() > 0) 
				{
					displayRecord();
				}
				printMenu();
				break;
				
			case 2:
				
				if(hospitalRecord.size()==0)
				{
					System.out.println("No record available, enter new patient's information to start!");
				}
				else 
				{
					displayRecord();
				}
				
				printMenu();
				break;
			case 3:
				System.out.println("3- Number of patients based on vaccination type\n");	
				vaccineCount();
				printMenu();
				break;
			case 4:
				System.out.println("4- Number of patients for each allergy type");
				allergyCount();
				printMenu();
				break;
			case 5://NOT COMPLETE
				
				String vaxChoice=null;
				System.out.println("Enter the choice of vaccine type:");
				for (int i=0; i<vaccineList.size();i++)
				{
					System.out.println("\n"+ (i+1) +"- "+vaccineList.get(i).getVaccineType());
				}
				
					try
					{
						choiceCase5 = sc.nextInt();
					}
					catch (InputMismatchException e)
					{
						System.out.println("\nInvalid option, enter integer only.\n");
						sc.next();
						continue;
					}
					for (int i=0;i<vaccineList.size();i++)
					{
						if (choiceCase5==(i+1))
						{
							vaxChoice =vaccineList.get(i).getVaccineType();
							
						}
					}
					sortedRecord_VaxChoice=searchForRecord_VaxChoice(vaxChoice);
					sortedRecord_VaxChoice.stream().sorted((r1,r2)->r1.getP().getLastName().compareTo(r2.getP().getLastName())).forEach(System.out::println);
				
				printMenu();
				break;
			case 6: //NOT START
				System.out.println("Patients waiting for next appointment");
				
				patientWaitingForNextApt();
				printMenu();
				break;
			case 7:
				System.out.println("Patients who have completed three doses of vaccine");
				completedThreeDoses();
				printMenu();
				break;
			case 8:
				System.out.print("List of elderly patients who were given fewer than three doses");
				lessThanThreeDoses();
				printMenu();
				break;
			case 9:
				System.out.print("Thank you for using our service!");
				System.exit(menuChoice);
				break;
				
			default:
				System.out.println("Selection "+menuChoice+" is invalid.");
				printMenu();
				break;
			}
		}	
		
		}
	
// method to store list of options in main menu
	public static void printMenu()
	{
		System.out.println("\nPlease select the following options:\n");
		System.out.println("1- Enter new patient's information");
		System.out.println("2- Display record");
		System.out.println("3- Number of patients based on vaccination type");
		System.out.println("4- Number of patients based on allergy type");
		System.out.println("5- Sort all patients by last name based on vaccination type ");
		System.out.println("6- List of patients waiting for next appointment");
		System.out.println("7- List of patients who have completed three doses of vaccine");
		System.out.println("8- List of elderly patients who were given fewer than three doses");
		System.out.println("9- Exit");
		System.out.println("===================================================================");
		System.out.println("\n Enter option (e.g For option 3, type \"3\"): ");
	}
	
//method to create a vaccine Table with given data
	public static HashMap<Allergy,Vaccine> recVaxForAllergyTable() //method to create a vaccine Table
	{
		Allergy algy_Key;
		Vaccine vax_Value;
		recVaxForAllergyTable = new HashMap<>();
			for (int i=0;i<allergyList.size();i++)
			{
				algy_Key =allergyList.get(i);
				vax_Value=vaccineBasedOnAllergyType(algy_Key.getAllergyName());
				if (!(recVaxForAllergyTable.containsKey(algy_Key))&&(recVaxForAllergyTable.containsValue(vax_Value)))
				{
					recVaxForAllergyTable.put(algy_Key, vax_Value);
				}
			}
			
		return recVaxForAllergyTable;
		
	}
	
	public static Vaccine vaccineBasedOnAllergyType(String allergyName) //method provides condition to recommend vaccine type based on allergy
	{
		String vaccineType=null;
		if (allergyName.equals("Polythylene Glycol (PEG)")||allergyName.equals("Polysorbate 80 (PS80)"))
		{
			vaccineType = "AstraZeneca";
		}
		else if (allergyName.equals("Gelatin"))
		{
			vaccineType = "Pfizer";
		}
		//create new Vaccine object and pass in VaccineType
		Vaccine vax = new Vaccine(vaccineType);
		return vax;
	}
	
	public static ArrayList<Allergy> createAllergyList() // method creates an arraylist of Allergy objects
	{
		ArrayList<Allergy> algyList = new ArrayList<Allergy>();
		algyList.add(new Allergy(1, "Polythylene Glycol (PEG)"));
		algyList.add(new Allergy(2,"Polysorbate 80 (PS80)"));
		algyList.add(new Allergy(3, "Gelatin"));
		return algyList;
	}
	
	public static ArrayList <Vaccine> createVaccineList() //method creates arraylist of Vaccine objects
	{
		ArrayList<Vaccine> vaxList = new ArrayList<Vaccine>();
		vaxList.add(new Vaccine("AstraZeneca"));
		vaxList.add(new Vaccine("Pfizer"));
		
		return vaxList;
	}

//method to take user input to create a patient profile
	public static Record createRecordFromUserInput() 
	{
		int patientID=0;
		int age=0;
		int allergyChoice=0; //variable to hold user selection from allergy list
		String firstName="";
		String lastName = "";
		String allergyName = "";
		String vaccineDate ="";
		Scanner sc =new Scanner(System.in);
		boolean isValid=true;
		int maxNameLength =20;//character limit
		
//Asking for patient's ID and error handling block		
		do
		{
			System.out.println("- Patient ID: ");
			
			//handling exception in case the user inputs invalid data type 
			try
			{
				patientID = sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				
				System.out.println("Invalid patient ID, please enter integer only.");
				sc.next();
				continue;
			}
			break;
		}
		while(isValid==true)
		;
		
//Asking for patient's first name and error handling block	
		firstName=sc.nextLine();
		do
		{
			System.out.println("- First name: ");
			firstName = sc.nextLine().toLowerCase();
			if (firstName.length()>maxNameLength) //if the length of the input first name is longer than 20 characters, print out an error msg to explain why an error occurs, and prompt for a new answer
				{
					System.out.println("Character limit cannot exceed "+maxNameLength +" characters. It is currently "+firstName.length()+" characters long.\n");
				}
		}
		while (firstName.length()>maxNameLength);
		//
		
//Asking for patient's last name and error handling block
		
		do
		{
			System.out.println("- Last name: ");
			lastName = sc.nextLine().toLowerCase();
			if (lastName.length()>maxNameLength)//if the length of the input last name is longer than 20 characters, print out an error msg to explain why an error occurs, and prompt for a new answer
			{
				System.out.println("Character limit cannot exceed "+maxNameLength +" characters. It is currently "+lastName.length()+" characters long.\n");
			}
			
		}
		while (lastName.length()>maxNameLength);
		//sc.next();
		
//Asking for patient's age and error handling block	
		do
		{
			System.out.println("- Age: ");
			try
			{
				age = sc.nextInt();
				
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid age, enter positive integer only.");
				sc.next();
				continue;
			}
			if(age<=0 || age>120)
			{
				System.out.println("Invalid age, enter age between 1 and 120.");
				continue;
			}
			break;
		}while(isValid==true);
		
//Ask user to input patient's allergy (line 212-line234)	
		do
		{
			System.out.println("What is the patient allergic to?\n");
			for(int i=0; i<allergyList.size();i++)
			{
				allergyName = allergyList.get(i).getAllergyName();
				System.out.println(allergyList.get(i).getAllergyID()+"- "+allergyName+"\n");
			}
			System.out.println("Enter option (e.g For option 3, type \"3\"): ");
		//handling exception in case the user inputs invalid data type
			try
			{
				allergyChoice =sc.nextInt();
				for(int i=0; i<allergyList.size();i++)
				{
					if (allergyChoice==allergyList.get(i).getAllergyID())
					{
						allergyName = allergyList.get(i).getAllergyName();
					}
				}

			}
			catch (InputMismatchException e)
			{
				System.out.println("\nInvalid option, enter integer only.\n");
				sc.next();
				continue;
			}
			if(allergyChoice<1||allergyChoice>3)
			{
				System.out.println("\nInvalid option, select integer from the list\n");
				continue;
			}
			
		}
		while(allergyChoice<1||allergyChoice>3);
//Provide the recommended's vaccine based on the patient's allergy
		
		Vaccine vaccineType = vaccineBasedOnAllergyType(allergyName);//call method vaccineBasedOnAllergyType and pass String allergyName to the method
		recVaxForAllergyTable();//add the allergy (key) and vaccine (value) to the hashmap
		System.out.println(vaccineType.toString());
		
//Create a Patient object and check if the patient already exists in the list, then add the patient to the list		
		Patient newPatient = checkIfPatientWasRegistered(patientID,firstName,lastName,age,allergyName);	
			
//Ask user for date (line 242 - line 258)	
		do
		{
			System.out.println("- Enter date using format dd/MM/yyyy, without any space between the digit and the slash \"/\". \n\t i.e: type \"08/12/2023\"for the eigth of December,2023.\n");
			try
			{
				vaccineDate = sc.next();
				//vaccineDate.matches("(0[1-9]|[12][0-9]|3(01))(\\/|\\-)(0[1-9]|1[1,2])(\\/|\\-)(19|20)\\d{2}");
			}
			catch (Exception e)
			{
				System.out.println("Invalid date, please use format dd/MM/yyyy or dd-MM-yyyy.");
				sc.next();
				continue;
			}
			break;
		}while(isValid==true);
		Date newDate = new Date(vaccineDate);
		
//Create new record from all the inputs above
		Record newRecord = new Record(newPatient,vaccineType,newDate);
		System.out.println("***Patient Record***");
		System.out.println(newRecord.toString());
		return newRecord;			
	}
	
// Method to check if the patient profile already exists in the Patient List. If the patient was already registered, the program will use the existing Patient object in the patient list. If not, it creates a new patient object.
    public static Patient checkIfPatientWasRegistered(int patientID, String firstName, String lastName, int age, String allergyName) 
    {
    	
    	Patient registeredPatient = new Patient(patientID,firstName, lastName, age, allergyName); //create a Patient object
    	//System.out.println("size "+patientList.size());
	
		int i =-1;
		do
		{
			i++;
			if (patientList.size()==0)
			{
				//System.out.println("If patient list is empty, add new patient");
				patientList.add(registeredPatient);
				return registeredPatient;
			}
			else if (registeredPatient.toString().equals(patientList.get(i).toString()))
			{
				
				registeredPatient =patientList.get(i);	
				return registeredPatient;
			}
		}
		while (patientList.get(i)!=patientList.get(patientList.size()-1));
		
		patientList.add(registeredPatient);
		//System.out.println("added patient to list");
		return registeredPatient;
	}
 
 //Method to display hospital record
    public static void displayRecord()
    {
    	System.out.println("**Hospital Record**");
		for (int i=0; i<hospitalRecord.size();i++)
		{
			System.out.println(hospitalRecord.get(i)+"\n");
		}
    }
//method to count total number of patients of each allergy
	public static void allergyCount()
	{
		//Create a HashMap with allergy name and number of patients based on allergy as key-value pair.				
		allergyCount = new HashMap<>();
		String key1=null;
		int count1=0;
		for (int i=0; i< patientList.size();i++ )
		{
			key1 = patientList.get(i).getpatientAllergy();
			if (allergyCount.containsKey(key1))
			{
				count1 = allergyCount.get(key1);
				count1++;
				allergyCount.put(key1, count1);
			}
			else 
			{
				allergyCount.put(key1, 1);
			}
			
		}
		//Loop through the allergyCount HashMap and print out value pair				
		for (Map.Entry<String,Integer> entry: allergyCount.entrySet())
		{
			key1 = entry.getKey();
			count1 = entry.getValue();
			System.out.println("- Allergy type: "+ key1.toString()+"\n\tTotal no. of patients: "+count1);
		}
	}
//method to count total number of patient for each vaccine	
	public static void vaccineCount()
	{
		//Create a HashMap with recommended vaccine  and number of patients receive that vaccine as key-value pair.	
		vaccineCount = new HashMap<>();
		String key2=null;
		int count2=0;
		for (int i=0; i< patientList.size();i++ )
		{
			key2 = vaccineBasedOnAllergyType(patientList.get(i).getpatientAllergy()).getVaccineType();
			if (vaccineCount.containsKey(key2))
			{
				count2 = vaccineCount.get(key2);
				count2++;
				vaccineCount.put(key2, count2);
			}
			else 
			{
				vaccineCount.put(key2, 1);
			}	
		}
		//Loop through the vaccineCount HashMap and print out value pair				
		for (Map.Entry<String,Integer> entry: vaccineCount.entrySet())
		{
			key2 = entry.getKey();
			count2 = entry.getValue();
			System.out.println("- Vaccine type: "+ key2.toString()+"\n\tTotal no. of patients: "+count2);
		}
	}

//method to search the hospital record based on vaccine Type input //MISSING THE SORT BIT
	public static ArrayList<Record> searchForRecord_VaxChoice(String v)
	{
		Record r=null;
		ArrayList<Record> rl = new ArrayList<>();
		for(int i=0;i<hospitalRecord.size();i++)
		{
			if(v.equals((hospitalRecord.get(i).getV().getVaccineType())))
			{
				r=hospitalRecord.get(i);
				rl.add(r);
			}
		}
		return rl;
	}

//method to sort the hospital record based on patient's age ( the oldest patient comes up first on the list)
	public static void patientWaitingForNextApt()
	{
		patientList.stream().sorted(Comparator.reverseOrder()).forEach(p-> System.out.println(p));
	}
	
//Count the vaccine dose of a patient p	
	public static int doseCountForPatient(Patient p)
	{
		int doseCount=0;
		for(int i=0; i<hospitalRecord.size();i++)
		{
			Record currentR =hospitalRecord.get(i);
			if (p==currentR.getP())
			{
				doseCount++;
			}
		}
		return doseCount;
	}

//list patients that have 3 doses 
	public static void completedThreeDoses()
	{
		for (int i=0; i<patientList.size();i++)
		{
			if(doseCountForPatient(patientList.get(i))==3)
			{
				System.out.println(patientList.get(i)+ vaccineBasedOnAllergyType(patientList.get(i).getpatientAllergy()).toString()+"\n- Dose: "+doseCountForPatient(hospitalRecord.get(i).getP()));
			}
				
		}
	}
//list patients that are >=70 years old and have less than 3 doses	
	public static void lessThanThreeDoses() 
	{
		for (int i=0; i<patientList.size();i++)
		{
			if(doseCountForPatient(patientList.get(i))<3 && patientList.get(i).getPatientAge()>=70)
			{
				System.out.println(patientList.get(i)+ vaccineBasedOnAllergyType(patientList.get(i).getpatientAllergy()).toString()+"\n- Dose: "+doseCountForPatient(hospitalRecord.get(i).getP()));
			}
				
		}
	}
		
}
