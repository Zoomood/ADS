/**
 * Create a Record object
 * @author fnv512
 * @param p of type Patient holds all patient's information
 * @param recommendedVaccine holds the patient’s recommended vaccine
 * @param date of type Date holds the date that the patient receives their vaccine
 */
public class Record 
{
	Patient p; 
	Vaccine v;
	Date date; 
	
	public Record(Patient p, Vaccine v, Date date) 
	{
		this.p = p;
		this.v = v;
		this.date = date;
			
	}
	
	public String toString()
	{
		return p.toString() + v.toString() +date.toString();
	}

	public Patient getP() {
		return p;
	}

	public void setP(Patient p) {
		this.p = p;
	}

	public Vaccine getV() {
		return v;
	}

	public void setV(Vaccine v) {
		this.v = v;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
