import java.util.Scanner;
public class time_conversion
{
    String st,stnew;
    time_conversion()
    {
        Scanner sc = new Scanner(System.in);
        st = sc.next();
        sc.close();
    }
    void time()
    {
        if(st.charAt(st.length()-2)=='P' && Integer.parseInt(st.substring(0,2))!=12)
        {
            int t = Integer.parseInt(st.substring(0,2));
            stnew = Integer.toString(t+12)+st.substring(2,st.length()-2);
        }
        else if(Integer.parseInt(st.substring(0,2))==12 && st.charAt(st.length()-2)=='A')
        {
                stnew = "00"+st.substring(2,st.length()-2);
        }
        else
        {
                stnew = st.substring(0,st.length()-2);
        }
        System.out.println(stnew);
    }
    public static void main(String args[])
    {
        new time_conversion().time();
    }
}