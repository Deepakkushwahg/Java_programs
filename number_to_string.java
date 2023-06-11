import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class number_to_string {
    static HashMap<Integer, Character> map;

    static void getPossibleStrings(int index, String num, StringBuilder currentString, List<String> res) {
        if (index == num.length()) {
            res.add(currentString.toString());
            return;
        }
        int digit = Character.getNumericValue(num.charAt(index));
        if (map.containsKey(digit)) {
            currentString.append(map.get(digit));
            getPossibleStrings(index + 1, num, currentString, res);
            currentString.deleteCharAt(currentString.length() - 1);
        }
        if (index + 1 < num.length()) {
            int doubleDigit = Integer.parseInt(num.substring(index, index + 2));
            if (map.containsKey(doubleDigit)) {
                currentString.append(map.get(doubleDigit));
                getPossibleStrings(index + 2, num, currentString, res);
                currentString.deleteCharAt(currentString.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> res = new ArrayList<>();
        map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            char ch = (char) ('A' + i - 1);
            map.put(i, ch);
        }
        System.out.println("Enter the number");
        int num = sc.nextInt();
        getPossibleStrings(0, String.valueOf(num), new StringBuilder(), res);
        System.out.println("All possible strings are "+ res);

    }
}
