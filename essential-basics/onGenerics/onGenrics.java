import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//ArrayList inherits from List
class onGenerics{
  
  public static void next(){
    //型変数にstringがバインドされている。
    //String以外受け付けないし、String型を返すことが保障される
    List<String> list = new ArrayList<String>();
    list.add("hello! one");
    String str1 = list.get(0);
    System.out.println(str1);
  }
  public static void main(String[] args){
    List list = new ArrayList();
    list.add("hello!");
    String str = (String) list.get(0);
    System.out.println(str);
    next();
    //ここまでがgenericsを使わない場合
    //add()の引数はObject型、どんな参照型でもaddできた。
    //get()の戻り値もObject型で宣言されるため、castが必要だった。
    //もし、ListオブジェクトにString型以外のオブジェクトがコンタミすると、実行時にClassCastExceptionが発生してしまう。
  }
}
