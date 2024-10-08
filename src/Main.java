import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chữ cần phân tích: ");
        String input = scanner.nextLine();
        countVietnameseAccented(input);
    }
    public static void countVietnameseAccented(String input) {
        Set<String> telexCombinations = new HashSet<>(Arrays.asList("aw", "aa", "dd", "ee", "oo", "ow", "uw", "w"));
        List<String> match = new ArrayList<>();
        int i = 0;
        while (i < input.length()) {
            if (i < input.length() - 1 && telexCombinations.contains(input.substring(i, i + 2))) {
                match.add(input.substring(i, i + 2));
                i += 2;
            }
            else if (telexCombinations.contains(String.valueOf(input.charAt(i)))) {
                match.add(String.valueOf(input.charAt(i)));
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println( match.size() + " " + match);
    }
}
