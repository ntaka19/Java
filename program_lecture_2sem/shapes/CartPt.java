package shapes;
import geometry.Posn;

public class CartPt {
	int x;
	int y;
	
	public CartPt(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	public Posn cartPtPosn(){
		return new Posn(this.x,this.y);
	}

}
