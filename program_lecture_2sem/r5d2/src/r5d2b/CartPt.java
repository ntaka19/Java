package r5d2b;
import geometry.Posn;

public class CartPt {
	int x;
	int y;
	
	public CartPt(int x, int y){
	this.x = x;
	this.y = y;
	         
	}
	
	public Posn cartPtToPosn(){
	return new Posn(this.x,this.y);
	}

}
