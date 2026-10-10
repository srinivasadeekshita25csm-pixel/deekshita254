package basics;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCombinations {
    static String[] letters = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index,
                         String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String choices = letters[digits.charAt(index) - '0'];

        for (int i = 0; i < choices.length(); i++) {
            generate(digits, index + 1,
                     current + choices.charAt(i), result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine();

        List<String> result = new ArrayList<>();

        if (!digits.isEmpty()) {
            generate(digits, 0, "", result);
        }

        System.out.println(result);
        sc.close();
    }
}

