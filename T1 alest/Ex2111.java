import java.util.Scanner;

public class Ex2111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            printSorobanRepresentation(number);
            System.out.println();
        }
    }

    public static void printSorobanRepresentation(int number) {
        int[] digits = new int[9]; // Array to store each digit

        // Extract each digit from the number
        for (int i = 8; i >= 0; i--) {  
            digits[i] = number % 10;
            number /= 10;
        }

        // Print the top rows of stones (worth 5)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                if (digits[j] >= 5) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        // Print the separator line
        System.out.println("---------");

        // Print the bottom rows of stones (worth 1)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (digits[j] % 5 > i) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
