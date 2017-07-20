//著者とその情報（誕生日）
class Author{
    String name;
    int birthday;

    Author(String name, int birthday){
        this.name = name;
        this.birthday = birthday;
    }
}

//本の情報
class Book{
    Author a;
    String title;
    int price; // in cents
    int year; // published year

    Book(Author a, String title, int price, int year) {
        this.a = a;
        this.title = title;
        this.price = price;
        this.year = year;
    }
}

//本の情報の例
class BookExamples{
    Author Fyodor_Dostoyevsky = new Author("Fyodor Dostoyevsky",1821);
    Author Leo_Tolstoy = new Author("Leo Tolstoy",1857);
    Author Osamu_Dazai = new Author("Osamu Dazai",1909);

    Book Crime_and_Punishment= new Book(Fyodor_Dostoyevsky,"Crime and Punishment",388,2001);
    Book What_is_art = new Book(Leo_Tolstoy,"What is art?",2595,2013);
    Book No_Longer_Human = new Book(Osamu_Dazai,"No Longer Human",759,1973);
}