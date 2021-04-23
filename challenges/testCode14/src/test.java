import java.util.ArrayList;
import java.util.List;

public class test {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");


    System.out.println(list);

    DuckDuckGoose(list, 2);
    System.out.println(list);

  }

  public static List<String> DuckDuckGoose(List<String> list, int k) {
    int temp = k;
    while (list.size() != 1) {
      list.remove(temp - 1);
      System.out.println(list);
      temp += temp ;
      if (temp > list.size())
        temp = temp - list.size();
    }
    return list;
  }
}
