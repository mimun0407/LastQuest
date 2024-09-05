import java.util.*;

public class TelexCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chữ cần phân tích: ");
        String input = scanner.nextLine();
        countVietnameseAccentedLetters(input);
    }
    public static void countVietnameseAccentedLetters(String input) {
        Set<String> telexCombinations = new HashSet<>(Arrays.asList("aw", "aa", "dd", "ee", "oo", "ow", "uw", "w"));
        List<String> matchedCombinations = new ArrayList<>();
        int i = 0;
        while (i < input.length()) {
            if (i < input.length() - 1 && telexCombinations.contains(input.substring(i, i + 2))) {
                matchedCombinations.add(input.substring(i, i + 2));
                i += 2;
            }

            else if (telexCombinations.contains(String.valueOf(input.charAt(i)))) {
                matchedCombinations.add(String.valueOf(input.charAt(i)));
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println( matchedCombinations.size() + " " + matchedCombinations);
    }
}
