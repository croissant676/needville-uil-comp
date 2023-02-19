import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vinay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("vinay.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            String s = scanner.nextLine();
            char[] charArray = s.toLowerCase().toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : charArray) {
                if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
            boolean odd = false, allowed = true;
            for (Character character : map.keySet()) {
                if (odd && map.get(character) % 2 == 1) {
                    allowed = false;
                    break;
                } else if (map.get(character) % 2 == 1) {
                    odd = true;
                    map.put(character, map.get(character) - 1);
                }
            }
            if (!allowed || map.keySet().size() == 0) {
                System.out.println(s + " can not be rearranged to form a palindrome.");
                continue;
            }
            int sum = map.keySet().stream().map(e -> map.get(e) / 2)
                    .reduce(0, Integer::sum);
            long num = factorial(sum);
            for (Character character : map.keySet()) {
                num /= factorial(map.get(character) / 2);
            }
            System.out.println(s + " can be rearranged to form " + num + " distinct palindrome(s).");
        }
    }

    private static long factorial(int x) {
        long product = 1;
        for (int i = 2; i <= x; i++) {
            product *= i;
        }
        return product;
    }
}
