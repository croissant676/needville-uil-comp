import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Karen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("karen.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            int number = scanner.nextInt();
            int low = (int) Math.pow(Math.floor(Math.sqrt(number)), 2);
            int high = (int) Math.pow(Math.ceil(Math.sqrt(number)), 2);
            if (number - low > high - number) {
                System.out.println(high);
            } else {
                System.out.println(low);
            }
        }
    }
}
