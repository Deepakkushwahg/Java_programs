package regex;
import java.util.regex.*;
public class example4
{
    public static void main(String[] args) {
        System.out.println("? quantifier......");
        System.out.println(Pattern.matches("[amn]?","a"));   // true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","aaa"));   // false (a come more than one time)
        System.out.println(Pattern.matches("[amn]?","aammmm"));  // false (a or m or n come more than one time)
        System.out.println(Pattern.matches("[amn]?","aazzta"));   // false (a come more than one times)
        System.out.println(Pattern.matches("[amn]?","am"));  // false (a or m or n come must one time)

        System.out.println("\n\n+quantifier.....");
        System.out.println(Pattern.matches("[amn]+","a"));  // true (a or m or n once or more time)
        System.out.println(Pattern.matches("[amn]+","aaa"));   // true (a come more than one time)
        System.out.println(Pattern.matches("[amn]+","aammmm"));   // true (a or m or n come more than once)
        System.out.println(Pattern.matches("[amn]+","aazzta"));  //false (z and t are not matching pattern)

        System.out.println("\n*quantifier......");
        System.out.println(Pattern.matches("[amn]*","ammma"));   //true (a or m or n may come zero or more one times)
    }
}
