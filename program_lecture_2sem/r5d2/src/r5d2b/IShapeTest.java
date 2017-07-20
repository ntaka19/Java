package r5d2b;

import static org.junit.Assert.*;
import draw.*;
import org.junit.Test;

public class IShapeTest {
	Canvas c = new Canvas(300, 300);
    CartPt p = new CartPt(150, 150);
    CartPt p2 = new CartPt(120,100);
     
    AShape squ = new Square(p, 100);
    AShape cir = new Circle(p, 100);
    AShape dot = new Dot(p);
    
    ShapeWorld w1 = new ShapeWorld(new Square(p2,100),c);
     
    @Test
    public void testDraw() {
        assertEquals(true, c.show());
        /*assertEquals(true, cir.draw(c));
        assertEquals(true,squ.draw(c));
        assertEquals(true, dot.draw(c));*/
        
        /*
         * WorldのonTick,onKeyEventで図形がmove、morphするかを確かめるテスト。
         * 画面に動作が表示されない。
         */ 
         
        /*assertEquals(true,w1.draw());*/
       
        assertEquals(true,w1.bigBang(200,200,0.1));
        assertEquals(true, c.pause());
        
        
    }


}
