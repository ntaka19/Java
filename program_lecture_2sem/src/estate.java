//住所の情報（通りの番号、通りの名前、市)
class Address{
    int street_number;
    String street_name;
    String city;

    Address(int street_number,String street_name,String city){
        this.street_number = street_number;
        this.street_name = street_name;
        this.city = city;
    }
}

//不動産の情報(種類、部屋の数、価格、住所）
class Estate{
    String style;
    int rooms; //部屋の数
    int price; //ドル
    Address a;

    Estate(String style, int rooms, int price, Address a){
        this.style = style;
        this.rooms = rooms;
        this.price = price;
        this.a = a;
    }
}

class EstateExamples{
    Address a1 = new Address(23,"Maple Street","Brookline");
    Address a2 = new Address(5,"Joye Road","Newton");
    Address a3 = new Address(83,"Winslow Road","Waltham");

    Estate e1 = new Estate("Ranch",7,375000,a1);
    Estate e2 = new Estate("Colonial",9,450000,a2);
    Estate e3 = new Estate("Cape",6,235000,a3);
}