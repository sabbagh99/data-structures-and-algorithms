package LeftJoin;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {

  List<Object> list = new ArrayList();
  String[] arr = new String[5000];

  public String[] leftJoin(Hashtable table1, Hashtable table2) {
    int j =0;
    for (int i = 0; i < table1.size; i++) {
      if (table1.arr[i] != null) {
        list.add(table1.arr[i].key);
        list.add(table1.arr[i].value);
        list.add(table2.get(table1.arr[i].key));

//        arr[j] = (String) table1.arr[i].key + "," + table1.arr[i].value + "" + table2.arr[i].value;
        arr[j] = "\n["+(String) list.get(j) + "," + list.get(j+1) + "," + list.get(j+2)+"]";

        j++;
      }
//      else {
//        arr[i] = (String) table1.arr[i].key + "," + table1.arr[i].value + "" + null;
//      }
    }
    return arr;
  }
}
