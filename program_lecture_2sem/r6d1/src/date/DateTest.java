package date;

import static org.junit.Assert.*;
import org.junit.Test;


public class DateTest {

		@Test
		public void testBadDates(){
			try{
				Date badDay = new Date(99,9,1999);
				fail("Run time exception is expected");
			}catch(RuntimeException e){
				assertEquals("the given numbers do not specify a date", e.getMessage());
			}
		}
	}

