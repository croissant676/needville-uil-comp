import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DryRun {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dryrun.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < count; index++) {
            System.out.println("I like " + scanner.nextLine() + ".");
        }
    }
}
