package Array;
import java.util.*;
public class valid_sudoku_leetcode {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();
        for(int i=0;i<9;i++){
            if(i==3 || i==6){
                set1.clear();
                set2.clear();
                set3.clear();
            }
            for(int j=0;j<9;j++){
                if(j<3){
                    if(board[i][j]!='.' && !set1.contains(board[i][j])){
                        set1.add(board[i][j]);
                    }
                    else if(set1.contains(board[i][j])){
                        return false;
                    }
                }
                else if(j<6){
                    if(board[i][j]!='.' && !set2.contains(board[i][j])){
                        set2.add(board[i][j]);
                    }
                    else if(set2.contains(board[i][j])){
                        return false;
                    }
                }
                else{
                    if(board[i][j]!='.' && !set3.contains(board[i][j])){
                        set3.add(board[i][j]);
                    }
                    else if(set3.contains(board[i][j])){
                        return false;
                    }
                }
                if(board[i][j]!='.' && !set.contains(board[i][j])){
                    set.add(board[i][j]);
                }
                else if(set.contains(board[i][j])){
                    return false;
                }
            }
            set.clear();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]!='.' && !set.contains(board[j][i])){
                    set.add(board[j][i]);
                }
                else if(set.contains(board[j][i])){
                    return false;
                }
            }
            set.clear();
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sudoku of 9x9");
        char[][] board = new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(new valid_sudoku_leetcode().isValidSudoku(board));
    }
}
