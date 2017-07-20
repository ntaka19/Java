package r5d2b;
import draw.*;
import colors.*;

public class Square extends AShape{
	int size; 
	Square(CartPt loc, int size){
	super(loc);
	this.size = size; 
	}
	
	 public boolean draw(Canvas c) {
	 return c.drawRect(this.loc.cartPtToPosn(), this.size, this.size, new Blue());
	}

		
		/*目的：右へ５だけ動かす*/
	public AShape move() {
		return new Square(new CartPt(this.loc.x+5, this.loc.y), this.size);
	}

	public AShape morph() {
		return new Circle(this.loc,this.size);
	}

}
