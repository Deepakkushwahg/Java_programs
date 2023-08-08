package Accenture_previous_year_questions;

import java.util.Scanner;

//– A denotes AND operation
//– B denotes OR operation
//– C denotes XOR Operation
public class solve_binary_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string like 1A0A0B1C0C1C0");
        String st = sc.next();
        int prev = st.charAt(0)-'0';
        for(int i=1;i<st.length();i=i+2){
            char sym = st.charAt(i);
            int next = st.charAt(i+1)-'0';
            switch(sym){
                case 'A':
                    prev = prev & next;
                    break;
                case 'B':
                    prev = prev | next;
                    break;
                case 'C':
                    prev = prev ^ next;
                    break;
                default:
                    break;
            }
        }
        System.out.println("output is "+ prev);
    }
}
