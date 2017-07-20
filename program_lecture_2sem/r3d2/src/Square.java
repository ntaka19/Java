//正方形のクラス
public class Square implements IShape{
	CartPt loc;
	int size;
	
	Square(CartPt loc, int size){
		this.loc = loc;
		this.size = size; 
	}
	/*
	 * 目的：ある点が正方形の中に含まれるか（境界も含む）
	 */
	
	public boolean contains(CartPt p){
		if (p.x >= this.loc.x && p.x <= this.loc.x + this.size && p.y >= this.loc.y && p.y <= this.loc.y +this.size ){ return true;}
		else return false;
	}
}
