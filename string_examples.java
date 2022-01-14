public class string_examples
{
    public static void main(String args[]) 
    {
        // equals method:- it is used for campare two string with case sensitive more if string match than it will return boolean value true otherwise false.
        //   prototype---->  boolean = String.equals(String); 
        String st1 = "We are learning cloud";
        String st2 = "We are learning cloud";
        System.out.println(st1);
        System.out.println(st2);
        boolean result1 = st1.equals(st2);
        System.out.println(result1);

        // equalsIgnoreCase() :- it is used for campare two string without case sensitive more if string match than it will return boolean value true otherwise false.
        //              prototype -----> boolean = String.equalsIgnoreCase(String);
        String str1s = "We are learning cloud";
        String str2s = "we are learning cloud";
        boolean result2 = str1s.equalsIgnoreCase(str2s);
        System.out.println(result2);


        // concat() :- it is used for merge two strings.
        //      prototype---->  String = String.concat(String);
        String str1 = "JAVA";
        String str2 = "Programming";
        String result3 = str1.concat(str2);
        System.out.println(result3);

        // String vs StringBuffer
        StringBuffer stb1 = new StringBuffer(str1);
        StringBuffer stb2 = new StringBuffer(str2);
        System.out.println(stb1);
        System.out.println(stb2);
        System.out.println("\n\n--------------------------------------------------\n\n");
        stb1.append(stb2);
        System.out.println(stb1);

        // StringTokenizer:-

        // architecture of java

    }
    
}
