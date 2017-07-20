package diffLists;

public class PhoneBookEntry extends Entry{
	
	PhoneBookEntry(String name,PhoneNumber phoneNumber){
		super(name,phoneNumber);
	}
	
	boolean lessThan(PhoneBookEntry that){
		return 0 > this.name.compareTo(that.name);
	}
}
