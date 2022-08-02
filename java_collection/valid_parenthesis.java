package java_collection;

import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {

    public boolean validParen(String str)
    {
        if(str.isEmpty())
            return true;
        if(str.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if (current == '(' || current == '[' || current == '{')
            {
                stack.push(current);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char peekChar = stack.peek();
                if ((current == ')' && peekChar != '(') || (current == '}' && peekChar != '{') || (current == ']' && peekChar != '['))
                {
                    return false;  // for a valid input, a close brackets must have an open brackets
                }
                else
                {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        if(stack.peek() == '(' || stack.peek() == '[' || stack.peek() == '{'){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        valid_parenthesis obj = new valid_parenthesis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of parenthesis");
        String st = sc.next();
        System.out.println(obj.validParen(st));
    }

}