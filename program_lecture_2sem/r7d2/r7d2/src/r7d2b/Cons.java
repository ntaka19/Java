package r7d2b;

//整数のリストを定義する
public class Cons implements IList {
	private int fst;
	private IList rst;
	
	
	public Cons(int fst, IList rst) {
		this.fst = fst;
		this.rst = rst;
	}
	
	//setRestで循環の作成
	public void setRest(IList rst){
		this.rst = rst;
	}
	
	//リストの値同値
	public boolean same(IList that){
		return that instanceof Cons //式の値がその型のインスタンスであればtrue
				&& this.fst == that.first()
				&& this.rest().same(that.rest());//残りも要素のfst値を比較している
	}
	
	public int first(){
		return this.fst;
	}
	public IList rest(){
		return this.rst;
		}
	
	public boolean sameWithInitial(int initial){
		return initial == this.rst.first() || rst.sameWithInitial(initial);
	}
	
	public boolean isCycle(){
		/*
		 * リスト全体が循環しているか判定
		 * StackOverflow、runtimeexception で例外処理を行えば途中から循環しているものも対処できますが、
		 * hasCycleと実質同じ実装になるので問題文に沿ってやりました。
		 */
		int initial = this.first();
		return this.sameWithInitial(initial);
	
	}

	public boolean hasCycle() {
		
		/*
		 *リストに循環があるか判定
		 * この実装だと、stackoverflow であればリストが無限に続くのでサイクルが存在。
		 *runtime exception であればMTにあたっているのでサイクルが存在しないことを意味している。
		 *メモリに依存している点が問題な実装だと思います。ただ問題の深刻さはよくわからないです。
		 **/
		try {
			return rst.hasCycle();
		}
		catch (StackOverflowError error){
			return true;
		}
		catch (RuntimeException error){
			return false;
		}
	}
}



