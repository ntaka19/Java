package r6d2a;

import static org.junit.Assert.*;
import org.junit.Test;

public class BookTest {

	Author a1 = new Author("Fyodor Dostoyevsky",1490);
			
	@Test
	public void test() {
		//出版年が1500より早いケース
		try{
			Book badBook1 = new Book(a1,"Crime and Punishment",800,1491);
			fail("RuntimeException is expected.");	
		}catch (RuntimeException e){
			assertEquals("the given numbers do not specify a book",e.getMessage());
		}
		//価格が0より大きくないケース
		try{
			Book badBook2 = new Book(a1,"Crime and Punishment",0,1990);
			fail("RuntimeException is expected.");	
		}catch (RuntimeException e){
			assertEquals("the given numbers do not specify a book",e.getMessage());
		}
		//出版年が著者の誕生日より早いケース
		try{
			Book badBook3 = new Book(a1,"Crime and Punishment",800,1489);
			fail("RuntimeException is expected.");	
		}catch (RuntimeException e){
			assertEquals("the given numbers do not specify a book",e.getMessage());
		}
	}

}
