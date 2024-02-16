/**
 * Creates a Date object
 * @author fnv512
 * @param dateInput holds the text string to be parsed
 * @param formatter holds the date format
 * @param date holds the date
 */
import java.time.format.*;
import java.time.LocalDate;

public class Date {
	LocalDate date; 
	DateTimeFormatter formatter;
	String dateInput;   
	
	public Date(String dateInput)
	{
		this.dateInput=dateInput;
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		date =LocalDate.parse(dateInput, formatter);
	}
	
	@Override
	public String toString() {
		return "\n- Date: " + dateInput;
	}


}
