package r6d2c;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatientExamples {
	
	
	Doctor d1 = new Doctor("Sasaki","Ichiro",0120344034);
	Patient p1 = new Patient("Suzuki","Ko","male","O",d1);
	Patient p2 = new Patient("Cash","John","male","A",d1);
	Patient p3 = new Patient("Jane","Mary","female","B",d1);
	MTPatient mt = new MTPatient();
	
	//listは上からつけ加えている。つまりlist3については(p3,p2,p1,mt)の順番である。
	//このとき、getPatient(3) = p1である。
	
	IPatient list1 = new ConsPatient(p1,mt);
	IPatient list2 = new ConsPatient(p2,list1);
	IPatient list3 = new ConsPatient(p3,list2);
	
	
	@Test
	public void test() {
		assertEquals(3,list3.length());
		assertEquals(p1,list3.getPatient(3));
		
		//例外処理
		//返す値がmtのケース
		try {
			list3.getPatient(4);
		}catch(RuntimeException e){
			assertEquals("the given numbers do not specify a patient",e.getMessage());
		}
		//nが患者リストの長さより大きいケース
		try {
			list3.getPatient(5);
		}catch(RuntimeException e){
			assertEquals("the given numbers do not specify a patient",e.getMessage());
		}
	}

}
