//�~�̃N���X
public class Circle 
	implements IShape {
	CartPt loc;
	int radius;
	
	Circle(CartPt loc, int radius){
		this.loc = loc;
		this.radius = radius;
	}
	
	/*
	 *�ړI�F����_���~�̓����Ɋ܂܂�邩�i���E���܂ށj
	 */
	public boolean contains(CartPt p){
		if (Math.pow(p.x,2) + Math.pow(p.y,2) <= Math.pow(this.radius,2)) return true;
		else return false;
	}
}
