import java.util.Scanner;
public class Integer_to_roman {
    private String intToRoman(int num) {
        int len = 0,x=num;
        while(x>0){
            len++;
            x/=10;
        }
        int i=1;
        String st = "";
        while(num>0){
            x = num/(int)Math.pow(10,len-i);
            switch(len-i){
                case 1:
                    if(x<=3){
                        for(int j=0;j<x;j++){
                            st+="X";
                        }
                    }
                    else if(x==4)
                        st+="XL";
                    else if(x<=8){
                        st+="L";
                        for(int j=0;j<x-5;j++){
                            st+="X";
                        }
                    }
                    else
                        st+="XC";
                    break;

                case 2:
                    if(x<=3){
                        for(int j=0;j<x;j++){
                            st+="C";
                        }
                    }
                    else if(x==4)
                        st+="CD";
                    else if(x<=8){
                        st+="D";
                        for(int j=0;j<x-5;j++){
                            st+="C";
                        }
                    }
                    else
                        st+="CM";
                    break;

                case 3:
                    for(int j=0;j<x;j++){
                        st+="M";
                    }
                    break;

                default :
                    if(x<=3){
                        for(int j=0;j<x;j++){
                            st+="I";
                        }
                    }
                    else if(x==4)
                        st+="IV";
                    else if(x<=8){
                        st+="V";
                        for(int j=0;j<x-5;j++){
                            st+="I";
                        }
                    }
                    else
                        st+="IX";
            }
            num%=Math.pow(10,len-i);
            i++;
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 3999");
        int num = sc.nextInt();
        System.out.println("Roman number of "+num+" is "+new Integer_to_roman().intToRoman(num));
    }
}
