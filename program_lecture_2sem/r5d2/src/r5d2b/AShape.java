package r5d2b;

import draw.Canvas;

abstract class AShape implements IShape {
	CartPt loc;


	public AShape(CartPt loc) {
		this.loc = loc;// TODO Auto-generated constructor stub
	}

	public abstract AShape move();
	public abstract AShape morph();
	public abstract boolean draw(Canvas theCanvas);

}
