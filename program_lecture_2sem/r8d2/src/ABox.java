
public class ABox {
	Object content;
	
	ABox(Object content){
		this.content = content;
	}
	
	void swap(ABox that){
		Object c = this.content;
		this.content = that.content;
		that.content = c;
	}
}

