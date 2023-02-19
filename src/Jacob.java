import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jacob {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("jacob.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            int steps = Integer.parseInt(scanner.nextLine());
            double pi = 3;
            for (int n = 0; n < steps; n++) {
                int factor = (n % 2 == 0) ? 1 : -1;
                double numerator = 4 * factor;
                int firstDenominator = 2 * (n + 1);
                double denominator = (double) (firstDenominator) * (firstDenominator + 1) * (firstDenominator + 2);
                pi += numerator / denominator;
            }
            System.out.printf("%.13f", pi);
            System.out.println();
        }
    }
}
