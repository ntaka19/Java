package r7d2a;
import idraw.*;
import colors.*;
import geometry.*;

public class Square extends AShape {
 int size;
	 
	 Square(CartPt loc, int size){
	        super(loc);
	        this.size = size; 
	    }
	
	 		public void draw(Canvas c) {
	 			c.drawRect(new Posn(loc.x,loc.y), this.size, this.size, new Red());
	    }

			@Override
			/*目的：右へ５だけ動かす*/
			public void move() {
				this.loc.x = this.loc.x - 5;
				this.loc.y = this.loc.y;
			}

			@Override
			public AShape morph() {
				return new Circle(this.loc,this.size);
			}
}
