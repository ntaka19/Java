package r6d2a;

public class Book {
	Author author;
    String title;
    int price; // in cents
    int year; // published year

    public Book(Author author, String title, int price, int year) {
    	if((year>=1500)&&(year>author.birthyear)&&(price>0)){
    		this.author = author;
    		this.title = title;
    		this.price = price;
    		this.year = year;
    	}else {
			throw new RuntimeException("the given numbers do not specify a book");
		}
    }
}
