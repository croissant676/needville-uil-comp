import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tushar {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("tushar.dat"));
        int tests = scanner.nextInt();
        scanner.nextLine();
        for (int index = 0; index < tests; index++) {
            String[] tokens = scanner.nextLine().split(" ");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int[][] table = new int[row][col];
            for (int rowIndex = 0; rowIndex < row; rowIndex++) {
                table[rowIndex] = Arrays.stream(scanner.nextLine().split("\t"))
                        .mapToInt(Integer::parseInt).toArray();
            }
            List<Double> averages = new ArrayList<>();

            for (int value = 0; value < col; value++) {
                int currentRow = 0;
                int total = 0;
                int currentCol = value;
                int count = 0;

                while (currentRow < row && currentCol < col) {
                    count++;
                    total += table[currentRow][currentCol];
                    currentRow++;
                    currentCol++;
                }
                double avg = total / (double) count;
                averages.add(avg);
            }
            for (int value = 1; value < row; value++) {
                int currentRow = value;
                int total = 0;
                int currentCol = 0;
                int count = 0;
                while (currentRow < row && currentCol < col) {
                    count++;
                    total += table[currentRow][currentCol];
                    currentRow++;
                    currentCol++;
                }
                double avg = total / (double) count;
                averages.add(avg);
            }
            for (double average : averages) {
                System.out.printf("%.2f ", average);
            }
            System.out.println();
        }
    }
}
