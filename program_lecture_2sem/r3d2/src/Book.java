
public class Book {
    String author;
    String title;
    double price; // in cents
    int year; // published year
 
    Book(String author, String title, double price, int year) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
    }
    /*
     * 目的：本の買い取り価格を計算するメソッド。ただし、以下のように価格（cost)を決める
     * 19 世紀以前に出版された本は定価の 150%　(1801年以前)
     * 20 世紀前半 (1950 年まで) に出版された本は定価の80% (1950年は含まない）
     * それより後に出版された本は定価の 20%...
     * 例：
     * 	本A　定価100 cents　出版年 1700　買い取り価格　100*1.5 = 150 cents
     * 	本B　定価200 cents　出版年 1900　買い取り価格　200*0.8 = 160 cents
     * 	本C　定価300 cents　出版年 2000　買い取り価格　300*0.2 = 60 cents
     */
    double cost(){
        if (this.year <= 1801) {return 1.5 * this.price;}
            else {if (this.year < 1950) {return 0.8 * this.price;}
                else {return 0.2*this.price;}
            }
        }
  }