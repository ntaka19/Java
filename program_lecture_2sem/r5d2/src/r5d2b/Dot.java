package r5d2b;
import draw.*;
import colors.*;

public class Dot extends AShape{
	 Dot(CartPt loc){
     super(loc);
     }
     public boolean draw(Canvas c){
     return c.drawDisk(this.loc.cartPtToPosn(), 1, new Red());
     }
	
	//目的：下に５だけ動かす
	public AShape move() {
		return new Dot(new CartPt(this.loc.x, this.loc.y-5));
	}
	
	public AShape morph() {
		return new Circle(this.loc, 4);
	}
}
