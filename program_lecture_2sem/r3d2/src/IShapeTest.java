import static org.junit.Assert.*;
import org.junit.Test;
/*
 * 目的：点pが各図形に含まれるか判定するメソッドをテスト
 */
public class IShapeTest {
	
	CartPt p = new CartPt(2,2);
	CartPt p1 = new CartPt(2,2);
	CartPt p2 = new CartPt(0,0);

	IShape circle1 = new Circle(p1,2);
	IShape circle2 = new Circle(p2,5);
	IShape square1 = new Square(p1,2);
	IShape square2 = new Square(p2,1);
	IShape dot1 = new Dot(p1);
	IShape dot2 = new Dot(p2);
	
	@Test
	public void test() {
		assertEquals(circle1.contains(p),false);
		assertEquals(circle2.contains(p),true);
		
		assertEquals(square1.contains(p),true);
		assertEquals(square2.contains(p),false);
		
		assertEquals(dot1.contains(p),true);
		assertEquals(dot2.contains(p),false);
	}

}
