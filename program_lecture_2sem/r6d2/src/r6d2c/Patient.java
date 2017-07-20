package r6d2c;

public class Patient implements IPatient {
	String familyName;
	String name;
	String gender;
	String bType;
	Doctor doctor;
	
	public Patient(String familyName, String name, String gender, String bType,Doctor doctor) {
		this.familyName = familyName;
		this.name = name;
		this.gender = gender;
		this.bType = bType;
		this.doctor= doctor;
		
		this.doctor.plist = this;
	}
	public Patient getPatient(int n) {
		// TODO Auto-generated method stub
		return this;
	}
	public int length() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bType == null) ? 0 : bType.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result
				+ ((familyName == null) ? 0 : familyName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (bType == null) {
			if (other.bType != null)
				return false;
		} else if (!bType.equals(other.bType))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (familyName == null) {
			if (other.familyName != null)
				return false;
		} else if (!familyName.equals(other.familyName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
