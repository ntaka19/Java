//�_�̃N���X
class Dot implements IShape{
		CartPt loc;
		Dot(CartPt loc){
			this.loc = loc;
		}
		
		/*
		 *�ړI�F ����_���_�ƈ�v���邩����
		 */
		public boolean contains(CartPt p){
			if (p.x == this.loc.x && p.y == this.loc.y){return true;}
			else {return false;}
		}
}

