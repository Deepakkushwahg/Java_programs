import java.util.*;
public class string_tokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st1 = sc.nextLine();
        StringTokenizer st2 = new StringTokenizer(st1);
        System.out.println("No. of tokens are\n"+st2.countTokens()+"\nTokens are {");
        while (st2.hasMoreTokens())
        {
            System.out.println(st2.nextToken());
        }
        System.out.println("}");
    }
}