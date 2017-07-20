package r6d2b;
import colors.*;
import geometry.*;
import draw.*;

public class TrafficLight {
	  private boolean red;
	  private boolean yellow;
	  private boolean green;
	  int RADIUS = 50;
	  Posn RED_POS    = new Posn(RADIUS*5,RADIUS);
	  Posn YELLOW_POS = new Posn(RADIUS*3,RADIUS);
	  Posn GREEN_POS  = new Posn(RADIUS, RADIUS);
	  IColor BACKGROUND = new White();
	  IColor OFF = new DarkGray();
	  
	 private TrafficLight(boolean red, boolean yellow, boolean green) {
	    this.red    = red;
	    this.yellow = yellow;
	    this.green  = green;
	  }
	 
	 public TrafficLight(){
		 this.red = true;
		 this.yellow = false;
		 this.green = false;
	 }
	  
	  //to change this traffic light to the next state
	  TrafficLight change() {
	    if (this.red) {
	      return new TrafficLight(false, false, true);
	    } else if (this.yellow) {
	      return new TrafficLight(true, false, false);
	    } else {
	      return new TrafficLight(false, true , false);
	    }
	  }

	  //to determine the color of the green light
	  IColor green() {
	    if (this.green) {
	      return new Green();
	    } else {
	      return this.OFF;
	    }
	  }
	  //to determine the color of the yellow light
	  IColor yellow() {
	    if (this.yellow) {
	      return new Yellow();
	    } else {
	      return this.OFF;
	    }
	  }
	  //to determine the color of the red light
	  IColor red() {
	    if (this.red) {
	      return new Red();
	    } else {
	      return this.OFF;
	    }
	  }
	  //to draw this traffic light on the given canvas
	  boolean draw(Canvas c) {
	    return c.drawRect(new Posn(0,0), RADIUS*6, RADIUS*2, BACKGROUND) &&
	        c.drawDisk(this.RED_POS, this.RADIUS, this.red()) &&
	        c.drawDisk(this.YELLOW_POS, this.RADIUS, this.yellow()) &&
	        c.drawDisk(this.GREEN_POS, this.RADIUS, this.green());
	  }
}
