import java.util.*;

public class java_substring_comparisons
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> st = new ArrayList<String>();
        System.out.println("Enter the string");
        String s = scan.next();
        System.out.println("Enter the length of substrings");
        int k = scan.nextInt();
        scan.close();

        for(int i=0;i<=s.length()-k;i++)
        {
            st.add(s.substring(i,k+i));
        }
        Collections.sort(st);
        System.out.println(st.get(0));
        System.out.println(st.get(st.size()-1));
    }
}