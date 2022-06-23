import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class longest_substring_in_string {
    boolean checkChar(String subst,char ch)
    {
        for(int i=0;i<subst.length();i++)
        {
            if(ch==subst.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    void longest_substring(String st)
    {
        ArrayList<String> lst = new ArrayList<>();
        String subst = "";
        for(int i=0;i<st.length();i++)
        {
            if(!checkChar(subst,st.charAt(i)))
            {
                subst+= st.charAt(i);
            }
            else
            {
                lst.add(subst);
                subst = ""+st.charAt(i);
            }
        }
        lst.add(subst);
        int i=0;
        for (String s:lst)
        {
            if(lst.get(i).length() < s.length())
            {
                i = lst.indexOf(s);
            }
        }
        System.out.println("Longest substrings in '"+st+"' are");
        for (String s:lst)
        {
            if(s.length()==lst.get(i).length())
                System.out.print(lst.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.next();
        new longest_substring_in_string().longest_substring(st);
    }
}
