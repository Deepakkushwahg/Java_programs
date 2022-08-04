import java.util.Scanner;

public class String_to_Integer {
    public int myAtoi(String s) {
        String st = "";
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' || s.charAt(0) == '.'){
            st+="0";

        }
        else{
            for(int i=0;i<s.length();i++){
                if(Character.getNumericValue(s.charAt(i)) >= 0 && Character.getNumericValue(s.charAt(i)) <= 9)
                    st+=s.charAt(i);
                else if(s.charAt(i) == '-' || s.charAt(i) == '+')
                {
                    if(st.equals(""))
                        st+=s.charAt(i);
                    else
                        break;
                }
                else if(s.charAt(i) == '.' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) == ' ')
                    break;

            }
        }
        if(st.length() == 1 && st.equals("+") || st.equals("-")){
            return 0;
        }
        if(Double.parseDouble(st) >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(Double.parseDouble(st) <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = sc.nextLine();
        System.out.println(new String_to_Integer().myAtoi(s));
    }
}
