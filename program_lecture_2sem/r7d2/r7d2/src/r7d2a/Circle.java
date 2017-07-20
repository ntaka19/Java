package r7d2a;

import idraw.*;
import colors.*;
import geometry.*;

public class Circle extends AShape{
	int radius;
    
	public Circle(CartPt loc, int radius){
		super(loc);
		this.radius = radius;
	}
	
	public void draw(Canvas c){
		c.drawDisk(new Posn(loc.x,loc.y), this.radius, new Blue());
		return;
	}

	public void move() {
		this.loc.x = this.loc.x -5;
		this.loc.y = this.loc.y -5;		
		return;
	}

	public Dot morph() {
		return new Dot(this.loc);
	}
}
