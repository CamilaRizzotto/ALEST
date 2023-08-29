import java.util.Scanner;

public class Ex1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCasosTeste = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        for (int i = 0; i < numCasosTeste; i++) { //for com n
            String casoTeste = scanner.nextLine();
            int diamantesNoCaso = 0;
            int countDiamantes = 0;

            for (char c : casoTeste.toCharArray()) { // outro for com n para pesquisa do caracter
                if (c == '<') { //algortimo para escolha mantem complexidade constante
                    countDiamantes++;
                } else if (c == '>' && countDiamantes > 0) {
                    diamantesNoCaso++;
                    countDiamantes--;
                }
            }
            
            System.out.println(diamantesNoCaso);
        }
    }
}

//complexidade nˆ2