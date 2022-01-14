package java_collection.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrlist = new ArrayList();
        arrlist.add(sc.nextInt());
        arrlist.add(sc.nextInt());
        arrlist.add(sc.nextInt());
        arrlist.add(sc.nextInt());
        arrlist.add(sc.nextInt());
        int a = arrlist.get(3);

    }
    public static void main(String[] args) {
        arrayList obj = new arrayList();
        obj.func();
    }
}
