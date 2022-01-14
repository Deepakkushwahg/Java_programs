package java_collection.generics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class count_frequency_of_highest_no
{
    Scanner sc = new Scanner(System.in);
    int n,c=0;
    List<Integer> ls = new ArrayList();
    count_frequency_of_highest_no()
    {
        n = sc.nextInt();
        for(int i=0;i<n;i++)
            ls.add(sc.nextInt());
        sc.close();
    }
    void output()
    {
        Collections.sort(ls);
        int max = ls.get(ls.size()-1);
        for(int i=ls.size()-1;i>=0;i--)
        {
            if((int)ls.get(i)==max)
                c++;
        }
        System.out.println(c);
    }
    public static void main(String args[])
    {
        new count_frequency_of_highest_no().output();
    }
}