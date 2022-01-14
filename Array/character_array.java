package Array;

import java.util.Scanner;
public class character_array
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch[] = new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        new character_array().func();
    }
}
