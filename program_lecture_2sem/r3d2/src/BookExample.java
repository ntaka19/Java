import static org.junit.Assert.*;
import org.junit.Test;
/*
 * �e�X�g���܂ށB
 */

	public class BookExample {
		
	    Book Robinsoe_crusoe= new Book("Daniel Defoe","Robinsoe Crusoe",1550,1719);
	    Book Heart_of_Darkness = new Book("Joseph Conrad","Heart of Darkness",1280,1902);
	    Book Beach_music = new Book("Pat Conroy","Beach Music",950,1996);
	    Book To_kill_a_mockingbird = new Book("Harper Lee","To Kill a Mockingbird",611,1998);
	    
	    double EPS = 0.0001; //���e�덷
	    
	    /*
	     * �ړI�F������艿�i���������v�Z����Ă��邩�e�X�g
	     */
	    @Test
	    public void testCost() {
	        assertEquals(2325.0,Robinsoe_crusoe.cost(),EPS);
	        assertEquals(1024.0,Heart_of_Darkness.cost(),EPS);
	        assertEquals(190.0,Beach_music.cost(),EPS);
	        
	    }
	}

