package r7d2a;
import colors.*;
import geometry.*;
import idraw.*;

public class ShapeWorld extends World{
AShape theShape;
	
	ShapeWorld(AShape theShape,Canvas theCanvas){
		this.theShape = theShape;
		this.theCanvas = theCanvas;
		return;
	}
	
	public void draw(){
		theCanvas.drawRect(new Posn(0,0),500,500,new White());
		this.theShape.draw(theCanvas);
		return;
	}
	
	public void onTick() {
		this.theShape.move();
		this.theShape.draw(theCanvas);
		return;
	}

	
	public void onKeyEvent(String key) {
		this.theShape = this.theShape.morph();
		return;
	}
	
	
}
