import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fiorella {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("fiorella.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            long w, x, y, z, g;
            w = Long.parseLong(tokens[0]);
            x = Long.parseLong(tokens[1]);
            y = Long.parseLong(tokens[2]);
            z = Long.parseLong(tokens[3]);
            g = Long.parseLong(tokens[4]);
            double numerator = Math.log(((double) (g - z)) / (w * y));
            double denominator = Math.log(x);
            long ans = (long) (numerator / denominator);
            System.out.println(ans);
        }
    }
}
