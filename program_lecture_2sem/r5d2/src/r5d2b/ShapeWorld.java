package r5d2b;
import draw.*;

public class ShapeWorld extends World {
	
	AShape theShape;
	Canvas theCanvas;
	
	ShapeWorld(AShape theShape,Canvas theCanvas){
		
		this.theShape = theShape;
		this.theCanvas = theCanvas;
	}
	
	public World onTick() {
		return new ShapeWorld(this.theShape.move(), this.theCanvas);
	}

	public World onKeyEvent(String key) {
		return new ShapeWorld(this.theShape.morph(),this.theCanvas);
	}
	
	public boolean draw(){
		return this.theShape.draw(theCanvas);
	}
}
