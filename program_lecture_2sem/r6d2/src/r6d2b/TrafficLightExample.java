package r6d2b;

import static org.junit.Assert.*;

import org.junit.Test;
import draw.*;

public class TrafficLightExample {
	 TrafficLight l = new TrafficLight();
	 Canvas c = new Canvas(l.RADIUS * 6, l.RADIUS * 2);

	@Test
	public void test() {
		 assertEquals(true, c.show());
		    assertEquals(true,
		        l.draw(c) && c.pause() && 
		        l.change().draw(c) && c.pause() && 
		        l.change().change().draw(c) && c.pause() && 
		        l.change().change().change().draw(c) && c.pause());
		    assertEquals(true, c.close());
	}

}
