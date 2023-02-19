import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lautaro {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("lautaro.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            String str = scanner.nextLine();
            if (str.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
                System.out.println("Valid Phone Number.");
            } else {
                System.out.println("No Calls for You.");
            }
        }
    }
}
