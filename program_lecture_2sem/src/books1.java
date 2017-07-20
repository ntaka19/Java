//本の情報
class Book{
    String author;
    String title;
    int price; // in cents
    int year; // published year

    Book(String author, String title, int price, int year) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
    }
}

//本の情報の例
class BookExamples{
    Book Robinsoe_crusoe= new Book("Daniel Defoe","Robinsoe Crusoe",1550,1719);
    Book Heart_of_Darkness = new Book("Joseph Conrad","Heart of Darkness",1280,1902);
    Book Beach_music = new Book("Pat Conroy","Beach Music",950,1996);
    Book To_kill_a_mockingbird = new Book("Harper Lee","To Kill a Mockingbird",611,1998);
}

