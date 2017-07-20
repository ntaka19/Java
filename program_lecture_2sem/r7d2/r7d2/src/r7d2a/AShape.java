package r7d2a;
import idraw.*;

abstract class AShape implements IShape {
CartPt loc;
	
	public AShape(CartPt loc){
		this.loc = loc;
	}
	
	public abstract void draw(Canvas c);
	public abstract void move();
	public abstract AShape morph(); 
}
