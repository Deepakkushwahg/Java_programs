package java_collection;

import java.util.*;
public class setdemo
{
    void func()
    {
        Set st = new HashSet();
        st.add("Map");
        st.add(3.5);
        st.add("Chocolate");
        st.add(4);
        System.out.println(st);
        System.out.println("Size of set "+st.size());
    }

    public static void main(String[] args) {
        setdemo obj = new setdemo();
        obj.func();

    }

}
