/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LeftJoin;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    LeftJoin leftJoin = new LeftJoin();
    Hashtable table1 = new Hashtable();
    Hashtable table2 = new Hashtable();
    table1.add("fond", "enamored");
    table1.add("wrath", "anger");
    table1.add("diligent", "employed");
    table1.add("outfit", "garb");
    table1.add("guide", "usher");
    table2.add("fond", "averse");
    table2.add("wrath", "delight");
    table2.add("diligent", "idle");
    table2.add("guide", "follow");
    table2.add("flow", "jam");
    System.out.println(Arrays.toString(leftJoin.leftJoin(table1,table2)));

  }
}
