package block;

//多重定義
public class DrpBlock {
	private int down;
	private int right;
	
	//DrpBlock(10,20)はこっちで初期化
	private DrpBlock(int down, int right) {
		this.down = down;
		this.right = right;
	}
	//DrpBlock()はこっちで初期化
	public DrpBlock(){
		this.down = 10;
		this.right = 20;
	}
	
	public DrpBlock drop(){
		return new DrpBlock(this.down+1,this.right);
	}
}
