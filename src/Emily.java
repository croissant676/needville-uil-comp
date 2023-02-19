import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Emily {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("emily.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            String operation = scanner.nextLine();
            String[] tokens = operation.split(" ");
            int first = Integer.parseInt(tokens[0]);
            String op = tokens[1];
            int second = Integer.parseInt(tokens[2]);
            operation = operation + " = ";
            switch (op) {
                case "+" -> System.out.println(operation + (first + second));
                case "-" -> System.out.println(operation + (first - second));
                case "*", "x", "X" -> System.out.println(operation + (first * second));
                case "/" -> {
                    int result = first / second;
                    int remainder = first - result * second;
                    System.out.println(operation + result + " remainder " + remainder);
                }
            }
        }
    }
}
