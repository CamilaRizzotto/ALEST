import java.util.Scanner;

public class Soroban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            long number = scanner.nextLong();
            printSorobovRepresentation(number);
            System.out.println();
        }
    }

    public static void printSorobovRepresentation(long number) {
        int[] digits = new int[9]; // Array to store each digit

        // Extract each digit from the number
        for (int i = 8; i >= 0; i--) {
            digits[i] = (int) (number % 10);
            number /= 10;
        }

        // Prepare the top row of stones (worth 5)
        StringBuilder topRow = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            topRow.append(digits[i] >= 5 ? "1" : "0");
            topRow.append("11111");
        }
        System.out.println(topRow);

        // Print the separator line
        System.out.println("---------");

        // Print the bottom rows of stones (worth 1)
        for (int j = 0; j < 5; j++) {
            StringBuilder bottomRow = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                bottomRow.append(digits[i] % 5 > j ? "1" : "0");
            }
            System.out.println(bottomRow);
        }
    }
}
