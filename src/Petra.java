import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Petra {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("petra.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            String line = scanner.nextLine();
            int original = Integer.parseInt(line);
            int reversed = Integer.parseInt(reverseString(line));
            System.out.println(findGCF(original, reversed));
        }
    }

    public static int findGCF(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (min > 1 && max % min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return min;
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int index = input.length() - 1; index >= 0; index--) {
            builder.append(chars[index]);
        }
        return builder.toString();
    }
}
