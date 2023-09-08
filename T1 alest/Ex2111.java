import java.util.Scanner;

public class Ex2111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            createSorobanRepresentation(number);
            System.out.println();
        }
    }

    public static void createSorobanRepresentation(int number) {
        int[] digits = distribuiDigitos(number);

        int[][] todasLinhas = new int[7][9];
        todasLinhas[0] = new int[]{1,1,1,1,1,1,1,1,1};
        todasLinhas[1] = new int[]{0,0,0,0,0,0,0,0,0};
        todasLinhas[2] = new int[]{1,1,1,1,1,1,1,1,1};
        todasLinhas[3] = new int[]{1,1,1,1,1,1,1,1,1};
        todasLinhas[4] = new int[]{1,1,1,1,1,1,1,1,1};
        todasLinhas[5] = new int[]{1,1,1,1,1,1,1,1,1};
        todasLinhas[6] = new int[]{1,1,1,1,1,1,1,1,1};
        
        for (int i=0; i<9;i++){
            if (digits[i] >= 5){
                todasLinhas[0][i] = 0;
                todasLinhas[1][i] = 1;
            }
            int numero = digits[i]%5;
            todasLinhas[numero+2][i] = 0;
        }
        printSorobov(todasLinhas);
    }
    private static int[] distribuiDigitos(int numero){
            int[] digits = new int[9];
        for (int i = 8; i >= 0; i--) {
            digits[i] = numero % 10;
            numero /= 10;
        }
        return digits;
    }
    private static void printSorobov(int[][] todasLinhas){
        for(int i = 0; i<7; i++){
            for (int j=0; j<9; j++){
                System.out.print(todasLinhas[i][j]);                
            }
            if (i==1){
                System.out.print("\n---------");
            }    
        System.out.println();
        }
    }
}
