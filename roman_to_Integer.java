import java.util.Scanner;
public class roman_to_Integer {
    private int romanToInt(String s) {
        int number = 0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'I':
                    number+=1;
                    break;
                case 'V':
                    if(i!=0 && s.charAt(i-1)=='I')
                        number+=3;
                    else
                        number+=5;
                    break;
                case 'X':
                    if(i!=0 && s.charAt(i-1)=='I')
                        number+=8;
                    else
                        number+=10;
                    break;
                case 'L':
                    if(i!=0 && s.charAt(i-1)=='X')
                        number+=30;
                    else
                        number+=50;
                    break;
                case 'C':
                    if(i!=0 && s.charAt(i-1)=='X')
                        number+=80;
                    else
                        number+=100;
                    break;
                case 'D':
                    if(i!=0 && s.charAt(i-1)=='C')
                        number+=300;
                    else
                        number+=500;
                    break;
                case 'M':
                    if(i!=0 && s.charAt(i-1)=='C')
                        number+=800;
                    else
                        number+=1000;
                    break;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any roman number");
        String s = sc.next();
        System.out.println("Integer value of "+s+" is "+new roman_to_Integer().romanToInt(s));
    }
}
