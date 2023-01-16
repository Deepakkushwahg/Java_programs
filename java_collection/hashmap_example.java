package java_collection;

import java.util.HashMap;
import java.util.Map;

public class hashmap_example {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"blue");
        map.put(3,"Orange");
        map.put(4,"Black");
        map.put(5,"Yellow");
        map.put(6,"Green");
        map.put(1,"blue");
        for(Map.Entry x:map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue()); // print all value of hashmap or get
        }
        System.out.println("Size of hash map is "+map.size()); // get size of hashmap

        // copy all data of map1 to map2

        HashMap<Integer,String> map1 = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();
        map1.put(1,"Red");
        map1.put(2,"blue");
        map1.put(3,"Orange");
        map1.put(4,"Black");
        System.out.println("Value in first map "+ map1);
        map2.put(5,"yellow");
        map2.put(6,"green");
        map2.put(7,"white");
        System.out.println("Value in second map "+ map2);
        map2.putAll(map1);
        System.out.println("New value in second map "+ map2);


    }
}
