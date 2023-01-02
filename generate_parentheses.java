import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generate_parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        System.out.println("All possible combinations are\n"+new generate_parentheses().generateParenthesis(n));
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans,"",0,0,n);
        return ans;
    }
    private void backtrack(List<String> ans,String curr,int open,int close,int max){
        if(curr.length()==max*2){
            ans.add(curr);
            return;
        }
        if(open<max){
            backtrack(ans,curr+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(ans,curr+")",open,close+1,max);
        }
    }
}