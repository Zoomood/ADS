
public class Allergy 
{
	private int allergyID;
	private String allergyName;
	
	public Allergy(int allergyID,String allergyName)
	{
		this.allergyID = allergyID;
		this.allergyName=allergyName;
	}
	
	
	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}


	public int getAllergyID() {
		return allergyID;
	}


	public void setAllergyID(int allergyID) {
		this.allergyID = allergyID;
	}

	
}
