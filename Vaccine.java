/**
 * Creates a Vaccine object
 * @author fnv512
 * @param vaccine ID holds the vaccine ID
 * @param allergyType holds the allergy name
 * @param vaccineType holds the recommended vaccine for the allergy type
 */
public class Vaccine
	{
		private String vaccineType;

	
		public Vaccine( String type)
		{
			vaccineType = type;	
		}


		public String toString()
		{
			return "- Recommended Vaccine Type: "+ vaccineType;
		}
	
	//All getters and setters for attributes of Vaccine object
	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}
	
}
