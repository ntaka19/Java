package diffLists;

public class MenuItem {
	String name;
	int price;
	
	boolean lessThan(MenuItem that){
		return this.price < that.price;
		
	}
}
