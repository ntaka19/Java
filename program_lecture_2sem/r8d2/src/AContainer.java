
public class AContainer<VALUE> {
	VALUE content;
	
	AContainer(VALUE content){
		this.content = content;
	}
	
	VALUE get(){
		return content; 
	}
	
	void swap(AContainer<VALUE> that){
		VALUE c = this.content;
		this.content = that.content;
		that.content = c;
	}
}
