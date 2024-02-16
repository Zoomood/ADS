<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="" xml:lang="">
<h1>
<p>COM00141M</p>
<p>Department of Computer Science</p>
<p><strong>ALGORITHMS AND DATA STRUCTURES</strong></p>
</h1>
<p>EXAMINATION PRE-WORK</p>
<h1 id="assessment-backgroundscenario">Assessment
Background/Scenario</h1>
<p>A private hospital needs an application to manage <span
class="smallcaps">COVID</span>-19 vaccination records for its patients
who are allergic to polyethylene glycol (PEG), polysorbate 80 (PS80) or
gelatin. A member of the hospital staff enters the patient’s basic
information, such as their name, age and allergy, and decides which
vaccine (AstraZeneca or Pfizer) is suitable, based on Table 2. The staff
member then injects the selected vaccine and enters the information in
the system. The system <mark>generates a report based on the patient’s
allergy, as shown in Table</mark> 1.</p>
<p><strong>Table 1:</strong> Sample hospital data</p>
<table>
<colgroup>
<col style="width: 14%" />
<col style="width: 14%" />
<col style="width: 14%" />
<col style="width: 8%" />
<col style="width: 13%" />
<col style="width: 16%" />
<col style="width: 18%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Patient ID</strong></td>
<td><strong>First Name</strong></td>
<td><strong>Last Name</strong></td>
<td><strong>Age</strong></td>
<td><strong>Allergy</strong></td>
<td><strong>Vaccine Type</strong></td>
<td><strong>Date</strong></td>
</tr>
<tr class="even">
<td>1</td>
<td>Georgia</td>
<td>Roberts</td>
<td>23</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/15/2021</td>
</tr>
<tr class="odd">
<td>2</td>
<td>Charlie</td>
<td>Smith</td>
<td>40</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/15/2021</td>
</tr>
<tr class="even">
<td>3</td>
<td>Mariam</td>
<td>Dawson</td>
<td>27</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/17/2021</td>
</tr>
<tr class="odd">
<td>4</td>
<td>Emmett</td>
<td>Miller</td>
<td>30</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/20/2021</td>
</tr>
<tr class="even">
<td>5</td>
<td>Lily</td>
<td>Taylor</td>
<td>18</td>
<td>PEG</td>
<td>AstraZeneca</td>
<td>06/21/2021</td>
</tr>
<tr class="odd">
<td>6</td>
<td>Bill</td>
<td>Harley</td>
<td>70</td>
<td>PS80</td>
<td>AstraZeneca</td>
<td>07/21/2021</td>
</tr>
<tr class="even">
<td>3</td>
<td>Mariam</td>
<td>Dawson</td>
<td>27</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>07/17/2021</td>
</tr>
<tr class="odd">
<td>4</td>
<td>Emmett</td>
<td>Miller</td>
<td>30</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>07/20/2021</td>
</tr>
<tr class="even">
<td>3</td>
<td>Mariam</td>
<td>Dawson</td>
<td>27</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>08/19/2021</td>
</tr>
</tbody>
</table>
<p><strong>Table 2:</strong> Different allergies and recommended vaccine
type</p>
<table>
<colgroup>
<col style="width: 19%" />
<col style="width: 35%" />
<col style="width: 44%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>ID</strong></td>
<td><strong>Allergy</strong></td>
<td><strong>Recommended Vaccine Type</strong></td>
</tr>
<tr class="even">
<td>1</td>
<td>Polyethylene Glycol (PEG)</td>
<td>AstraZeneca</td>
</tr>
<tr class="odd">
<td>2</td>
<td>Polysorbate 80 (PS80)</td>
<td>AstraZeneca</td>
</tr>
<tr class="even">
<td>3</td>
<td>Gelatin</td>
<td>Pfizer</td>
</tr>
</tbody>
</table>
<h1 id="assessment-tasks">Assessment Tasks </h1>
<p>Design and build a console-based application that requires the user
to enter patient details and recommended vaccine type via the command
line and store them in an appropriate internal data structure.</p>
<ul>
<li><p>There is no requirement for this data to be preserved after the
application is closed.</p></li>
<li><p>You will need to consider what the application outputs to the
user that demonstrates the results of each task below.</p></li>
<li><p>You should provide the user with the means to close the program
once user operations are complete.</p></li>
</ul>
<p><mark>Your application should be able to perform the following tasks
as given in Section II. (Scenario):</mark></p>
<p><strong>Task A:</strong> Write pseudocode algorithms for the tasks
given below.</p>
<ol type="1">
<li><p>Store collected user input data (i.e. name, age, vaccine type and
date) based on initial check-up in an appropriate data structure. Sample
data is provided in Table 1.</p></li>
</ol>

<p>Store sample data on the different allergies and recommended vaccine
types in an appropriate data structure. Sample data is provided in Table
2.</p>
<p>2. Generate the sample report to show how many patients are given
each vaccination type, as given in Table 3 below.</p>
<p><strong>Table 3:</strong> <mark>Vaccine type given to
patients</mark></p>

<table>
<colgroup>
<col style="width: 6%" />
<col style="width: 43%" />
<col style="width: 49%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>ID</strong></td>
<td><strong>Vaccine Type</strong></td>
<td><strong>Count</strong></td>
</tr>
<tr class="even">
<td>1</td>
<td>AstraZeneca</td>
<td>2</td>
</tr>
<tr class="odd">
<td>2</td>
<td>Pfizer</td>
<td>4</td>
</tr>
</tbody>
</table>

<p>3. Take user input then sort all patients by last name who were given
the AstraZeneca/Pfizer vaccine. A sample output is shown in Table 4.</p>

<p>Sample - user input:</p>
<table>
<colgroup>
<col style="width: 100%" />
</colgroup>
<tbody>
<tr class="odd">
<td>Enter the choice of vaccine type (AstraZeneca/Pfizer):
AstraZeneca</td>
</tr>
</tbody>
</table>
<p><strong>Table 4:</strong> <mark>Vaccine type given to
patients</mark></p>
<table>
<colgroup>
<col style="width: 14%" />
<col style="width: 14%" />
<col style="width: 11%" />
<col style="width: 11%" />
<col style="width: 13%" />
<col style="width: 16%" />
<col style="width: 18%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Patient ID</strong></td>
<td><strong>First Name</strong></td>
<td><strong>Last Name</strong></td>
<td><strong>Age</strong></td>
<td><strong>Allergy</strong></td>
<td><strong>Vaccine Type</strong></td>
<td><strong>Date</strong></td>
</tr>
<tr class="even">
<td>6</td>
<td>Bill</td>
<td>Harley</td>
<td>70</td>
<td>PS80</td>
<td>AstraZeneca</td>
<td>07/21/2021</td>
</tr>
<tr class="odd">
<td>5</td>
<td>Lily</td>
<td>Taylor</td>
<td>18</td>
<td>PEG</td>
<td>AstraZeneca</td>
<td>06/21/2021</td>
</tr>
</tbody>
</table>

<p>4. Give preference to patients based on age who are waiting for their
next vaccination based on Table 1. A sample output is provided in Table
5.</p>
<p><strong>Table 5:</strong> Next vaccination appointment</p>

<table>
<colgroup>
<col style="width: 11%" />
<col style="width: 15%" />
<col style="width: 13%" />
<col style="width: 8%" />
<col style="width: 14%" />
<col style="width: 16%" />
<col style="width: 20%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Patient ID</strong></td>
<td><strong>First Name</strong></td>
<td><strong>Last Name</strong></td>
<td><strong>Age</strong></td>
<td><strong>Allergy</strong></td>
<td><strong>Vaccine Type</strong></td>
<td><strong>Date</strong></td>
</tr>
<tr class="even">
<td>6</td>
<td>Bill</td>
<td>Harley</td>
<td>70</td>
<td>PS80</td>
<td>AstraZeneca</td>
<td>07/21/2021</td>
</tr>
<tr class="odd">
<td>2</td>
<td>Charlie</td>
<td>Smith</td>
<td>40</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/15/2021</td>
</tr>
<tr class="even">
<td>4</td>
<td>Emmett</td>
<td>Miller</td>
<td>30</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/20/2021</td>
</tr>
<tr class="odd">
<td>3</td>
<td>Mariam</td>
<td>Dawson</td>
<td>27</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/17/2021</td>
</tr>
<tr class="even">
<td>1</td>
<td>Georgia</td>
<td>Roberts</td>
<td>23</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>06/15/2021</td>
</tr>
<tr class="odd">
<td>5</td>
<td>Lily</td>
<td>Taylor</td>
<td>18</td>
<td>PEG</td>
<td>AstraZeneca</td>
<td>06/21/2021</td>
</tr>
</tbody>
</table>

<p>5. Count the number of patients given for each allergy type based on
Table 2. A sample output is provided in Table 6.</p>
<p><strong>Table 6:</strong> Patient count based on allergy type</p>

<table>
<colgroup>
<col style="width: 44%" />
<col style="width: 55%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Allergy Type</strong></td>
<td><strong>Total no. of patients</strong></td>
</tr>
<tr class="even">
<td>PEG</td>
<td>1</td>
</tr>
<tr class="odd">
<td>PS80</td>
<td>1</td>
</tr>
<tr class="even">
<td>Gelatin</td>
<td>4</td>
</tr>
</tbody>
</table>

<p>6. Search, identify and list those patients who have completed three
doses of vaccine as given in Table 7.</p>

<p><strong>Table 7:</strong> Sample patient data – completed vaccine
doses</p>
<table>
<colgroup>
<col style="width: 10%" />
<col style="width: 15%" />
<col style="width: 12%" />
<col style="width: 7%" />
<col style="width: 10%" />
<col style="width: 25%" />
<col style="width: 17%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Patient ID</strong></td>
<td><strong>First Name</strong></td>
<td><strong>Last Name</strong></td>
<td><strong>Age</strong></td>
<td><strong>Allergy</strong></td>
<td><strong>Vaccine Type</strong></td>
<td><strong>Dose</strong></td>
</tr>
<tr class="even">
<td>3</td>
<td>Mariam</td>
<td>Dawson</td>
<td>27</td>
<td>Gelatin</td>
<td>Pfizer</td>
<td>3</td>
</tr>
</tbody>
</table>
<p>7. Search, identify and list the elderly patients (i.e. aged 70 or
above) who were given fewer than three doses as given in Table 8.</p>
<p><strong>Table 8:</strong> Sample patient data – lowest vaccine
doses</p>
<table>
<colgroup>
<col style="width: 10%" />
<col style="width: 13%" />
<col style="width: 9%" />
<col style="width: 8%" />
<col style="width: 10%" />
<col style="width: 23%" />
<col style="width: 22%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Patient ID</strong></td>
<td><strong>First Name</strong></td>
<td><strong>Last Name</strong></td>
<td><strong>Age</strong></td>
<td><strong>Allergy</strong></td>
<td><strong>Vaccine Type</strong></td>
<td><strong>Dose</strong></td>
</tr>
<tr class="even">
<td>6</td>
<td>Bill</td>
<td>Harley</td>
<td>70</td>
<td>PS80</td>
<td>AstraZeneca</td>
<td>1</td>
</tr>
</tbody>
</table>
<p><strong>Task B:</strong> Construct the application and implement
algorithms.</p>
<p><strong>1.</strong> Develop a <u>single</u> Java program that follows
coding conventions and enables the user to search, sort, count and
provide list of patients waiting for their next vaccination appointments
by using algorithms studied in this module, which are run from the
command line. The application should be text-based and menu-driven.</p>
<p><strong>2.</strong> Implement all the algorithms you have created for
Task A.</p>
<p>Note:</p>
<ul>
<li><p>You need to ensure that the user input is validated, and feedback
is given when an invalid input is entered.</p></li>
<li><p>Test all the implemented algorithms you have created for Task
A.</p></li>
</ul>
</body>
</html>

The application consists of the following classes:
Class Patient has 5 attributes of a Patient object:
Private variable patientID of type integer, holds the patient ID
Private variable firstName of type String, holds the patient’s first name
Private variable lastName of type String, holds the patient’s last name
Private variable patientAge of type integer, holds the patient’s age
Private variable patientAllergy of type String, holds the patient’s allergy type
1 constructor that takes in 5 parameters of type int, String, String, int, String respectively
1 toString() method to print out all patient’s information
Setters and getters for all variables
Class Allergy has:
2 attributes of an Allergy object:
Private AllergyID of type integer, holds the allergy ID
Private allergyName of type String, holds the allergy name
1 constructor that takes in 2 parameters of type int, String respectively
Setters and getters for all variables
Class Vaccine  has 1 attribute of a Vaccine object:
Private vaccineType of type String, holds the recommended vaccine for the allergy type
1 constructor that takes in 1 parameter of type String
1 toString() method to print out all vaccine’s information
Setters and getters for all variables
Class Date has:
3 attributes of a Date object:
Variable date of type LocalDate, holds the date
Variable formatter of type DateTimeFormatter, holds the date format
Variable dateInput of type String, holds the text string to be parsed
1 constructor that takes in 1 parameter of type String. The constructor allows us to create a Date object by: 
Set attribute dateInput to the local variable of type String
Pre-define 2 date formats for demonstration purpose : dd/MM/yyyy and dd-MM-yyyy
Parse dateInput  using LocalDate.parse() and set it to date
1 toString() method to print out the date 
Class Record  has:
4 attributes of a Record object:
Variable p of type Patient, holds all patient’s information
Variable recommendedVaccine of type String, holds the patient’s recommended vaccine
Variable date  of type Date, holds the date that the patient receives their vaccine
1 constructor that takes in 3 parameters of type Patient, String, Date respectively.
1 toString() method to print out all vaccine’s information
Class View  to store the main methods and other logics:
8 attributes:
ArrayList allergyList of type Allergy, holds a list of allergy type
ArrayList vaccineList of type Vaccine, holds a list of vaccine name
HashMap recVaxForAllergyTable with allergy types (type Allergy) as key and their recommended vaccine (type Vaccine) as value
ArrayList patientList of type Patient, holds a list of patient information 
ArrayList hospitalRecord of type Record, holds a list of records
HashMap allergyCount with allergy types (type Allergy) as key and total number of patients that have the allergy (type Integer) as value 

