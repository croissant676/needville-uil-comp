import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Shivani {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("shivani.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            String str = scanner.nextLine();
            // n * (n + 1) * (n * 2) / 6
            // equation derived from sum of squares
            BigInteger integer = new BigInteger(str);
            BigInteger solution = integer
                    .multiply(integer.add(BigInteger.ONE))
                    .multiply(integer.add(BigInteger.TWO));
            System.out.println(solution.divide(BigInteger.valueOf(6)));
        }
    }
}
