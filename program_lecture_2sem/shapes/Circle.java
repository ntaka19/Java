package shapes;
import draw.*;
import colors.*;

public class Circle implements IShape{
	CartPt loc;
	int radius;
	
	public Circle(CartPt loc,int radius){
		super();
		this.loc = loc;
		this.radius = radius;
	}
	public boolean draw(Canvas c){
		return c.drawCircle(loc.cartPtPosn(),this.radius, new Red());
	}
}
