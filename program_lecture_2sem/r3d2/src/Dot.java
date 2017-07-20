//点のクラス
class Dot implements IShape{
		CartPt loc;
		Dot(CartPt loc){
			this.loc = loc;
		}
		
		/*
		 *目的： ある点が点と一致するか判定
		 */
		public boolean contains(CartPt p){
			if (p.x == this.loc.x && p.y == this.loc.y){return true;}
			else {return false;}
		}
}

