package r6d2c;

public class ConsPatient implements IPatient{
	Patient fst;
	IPatient rst;
	
	public ConsPatient(Patient fst, IPatient rst) {
		this.fst = fst;
		this.rst = rst;
	}
	
	public Patient getPatient(int n){
		if (n<=0){
			throw new RuntimeException("the given numbers do not specify a patient");
		}
		else if (n==1){
			return this.fst;
		}
		else{
			return rst.getPatient(n-1);
		}
	}
	public int length(){
		return 1+this.rst.length();
	}
	
}
