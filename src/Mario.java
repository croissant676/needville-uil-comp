import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mario {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("mario.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            String line = scanner.nextLine();
            int length = Integer.parseInt(line.split(" ")[0]);
            String string = line.split(" ")[1];
            if (string.length() < length) {
                System.out.println("error");
                continue;
            }
            for (int i = 0; i < Math.min(length, string.length() / 2); i++) {
                string = string.substring(0, i) +
                        string.substring(string.length() - 1 - i, string.length() - i) +
                        string.substring(i + 1, string.length() - 1 - i) +
                        string.charAt(i) +
                        string.substring(string.length() - i);
            }
            System.out.println(string);
        }
    }
}
