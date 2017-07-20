package r6d2c;

public class Doctor {
	String familyName;
	String name;
	int telnumber;
	IPatient plist = null;
	
	public Doctor(String familyName, String name, int telnumber) {
		
		this.familyName = familyName;
		this.name = name;
		this.telnumber = telnumber;	
	}
	
	public Patient getPatient(int n){
		return this.plist.getPatient(n);
	}
	public int length(){
		return this.plist.length();
	}
	

}
