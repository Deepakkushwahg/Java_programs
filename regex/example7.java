/* create a regular expression that accepts 10 digit numeric characters starting with 7,8 or 9 only.*/
package regex;
import java.util.regex.*;
public class example7
{
    public static void main(String[] args) {
        System.out.println("by characters classes and quantifier....");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9917852434"));  //true
        System.out.println(Pattern.matches("[789][0-9]{9}","8953852434"));  //true

        System.out.println(Pattern.matches("[789][0-9]{9}","99178524343")); //false(11 characters)
        System.out.println(Pattern.matches("[789][0-9]{9}","6876543213"));  //false (starts from 6)
        System.out.println(Pattern.matches("[789][0-9]{9}","8817852434"));  //true

        System.out.println("by metacharacters.......");

        System.out.println(Pattern.matches("[789]{1}\\d{9}","8830852434"));  //true
        System.out.println(Pattern.matches("[789]{1}\\d{9}","3917852434"));  //false(starts from 3)
        System.out.println(Pattern.matches("\\d{2,3}[.]\\d{2,3}[.]\\d{2,3}","000.123.45"));
    }
}
