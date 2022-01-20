package java_collection.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generate_random_list
{
    static List<List> ls = new ArrayList<List>();
    static List<Integer> lst = new ArrayList<Integer>();
    static int x,n;
    generate_random_list()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of list: ");
        x = sc.nextInt();
        System.out.println("Enter the size of each list: ");
        n = sc.nextInt();
    }
    static void createList()
    {
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=n;j++)
            {
                lst.add(i*j);
            }
            ls.add(lst);
            lst.clear();
            System.out.println(ls);
        }
        System.out.println(ls);
    }
    public static void main(String[] args) {
        new generate_random_list();
        createList();
    }
}


//        p = int(input("Enter the number: "))
//        q = int(input("Enter the number: "))
//        print(ls)
//        if(p<n and q<x):
//        print("Verification success")
//        else:
//        l = ls[p-1]
//        ls[p-1]=ls[q-1]
//        ls[q-1]=l
//        print(ls)