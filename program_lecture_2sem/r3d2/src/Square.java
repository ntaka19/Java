//�����`�̃N���X
public class Square implements IShape{
	CartPt loc;
	int size;
	
	Square(CartPt loc, int size){
		this.loc = loc;
		this.size = size; 
	}
	/*
	 * �ړI�F����_�������`�̒��Ɋ܂܂�邩�i���E���܂ށj
	 */
	
	public boolean contains(CartPt p){
		if (p.x >= this.loc.x && p.x <= this.loc.x + this.size && p.y >= this.loc.y && p.y <= this.loc.y +this.size ){ return true;}
		else return false;
	}
}
