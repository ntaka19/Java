package shapes;

import draw.*;
import colors.*;

public class Square implements IShape{
	CartPt loc;
	int size;
	
	public Square(CartPt loc, int size) {
		super();
		this.loc = loc;
		this.size = size;
	}
	
	public boolean draw(Canvas c) {
		return c.drawRect(this.loc.cartPtPosn(), this.size, this.size, new Red());
	}
}
