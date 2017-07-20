package r7d2a;
import idraw.*;

import colors.*;
import geometry.*;


public class Dot extends AShape {
	Dot(CartPt loc){
        super(loc);
    }
    public void draw(Canvas c){
    c.drawDisk(new Posn(loc.x,loc.y), 1, new Red());
    return;
    }
    
	@Override
	//目的：下に５だけ動かす
	public void move() {
		this.loc.x = this.loc.x;
		this.loc.y = this.loc.y-5;
		return;
	}
	
	@Override
	public AShape morph() {
		return new Circle(this.loc, 4);
	}

}
