import java.util.Scanner;
public class reverse_words_in_string {
    public String reverseWords(String s) {
        s = s.trim();
        String st = "",str = "";
        char ch;
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(ch!=' ')
                st+=ch;
            else if(s.charAt(i-1)!=' '){
                str=ch+st+str;
                st = "";
            }
            else{
                str=st+str;
                st = "";
            }
        }
        str=st+str;
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string with spaces");
        String st = sc.nextLine();
        System.out.println("string after reverse\n"+new reverse_words_in_string().reverseWords(st));
    }
}
