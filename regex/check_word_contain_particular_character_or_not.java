package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check_word_contain_particular_character_or_not
{
    Scanner sc = new Scanner(System.in);
    String st;
    check_word_contain_particular_character_or_not()
    {
        System.out.println("Enter the String");
        st = sc.next();
        Pattern pt = Pattern.compile("\\w*g\\w*");
        Matcher m = pt.matcher(st);
        if(m.find())
        {
            System.out.println("Character found");
        }
        else
            System.out.println("Not found");
    }
    public static void main(String[] args) {
        new check_word_contain_particular_character_or_not();
    }
}
