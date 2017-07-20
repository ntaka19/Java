//円のクラス
public class Circle 
	implements IShape {
	CartPt loc;
	int radius;
	
	Circle(CartPt loc, int radius){
		this.loc = loc;
		this.radius = radius;
	}
	
	/*
	 *目的：ある点が円の内部に含まれるか（境界も含む）
	 */
	public boolean contains(CartPt p){
		if (Math.pow(p.x,2) + Math.pow(p.y,2) <= Math.pow(this.radius,2)) return true;
		else return false;
	}
}
