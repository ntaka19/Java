package shapes;
import draw.*;
import colors.*;

public class Dot implements IShape{
	CartPt loc;
	
	public Dot(CartPt loc){
		super();
		this.loc = loc;
	}
	public boolean draw(Canvas c){
		return c.drawDisk(this.loc.cartPtPosn(),1,new Red());
	}

}
