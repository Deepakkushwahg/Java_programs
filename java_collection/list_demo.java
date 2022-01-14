package java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class list_demo
{
    void func()
    {
        List ls = new ArrayList();
        ls.add("Coke");
        ls.add("Chocolate");
        ls.add(10);
        System.out.println(ls.get(0));
        ls.add("fruits");
        ls.add("Dairy milk");
        System.out.println(ls.get(1));  //find
        System.out.println(ls);
        ls.set(1,"pepsi"); // replace
        System.out.println(ls);
        ls.add(1,"kitkat"); // add at particular index
        ls.remove(0);
        ls.remove(4);
        System.out.println(ls);
        ls.clear();
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
        System.out.println("Length of list "+ ls.size());
    }
    public static void main(String[] args)
    {
        list_demo obj = new list_demo();
        obj.func();
    }
}
