package chapter12;

import java.util.*;
public class CollectionsDemo {
    public static void setDemo() {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        var i = fruit.iterator();
        while(i.hasNext()){
        }
    }
}
