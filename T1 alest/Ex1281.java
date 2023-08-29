import java.util.Scanner;

public class Ex1281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCasosTeste = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha

        for (int t = 0; t < numCasosTeste; t++) { //complexidade maxima n casos de ida ao super
            int numProdutos = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            String[] nomesProdutos = new String[numProdutos];
            double[] precosProdutos = new double[numProdutos];

            for (int i = 0; i < numProdutos; i++) { // complexidade maxima chamamos de P, pois depende do numero de produtos listados em cada ida ao super
                                                    //se aumentarmos o numero de produtos aumentamos o numero informacoes para cada produto
                String[] infoProduto = scanner.nextLine().split(" ");
                nomesProdutos[i] = infoProduto[0];
                precosProdutos[i] = Double.parseDouble(infoProduto[1]);
            }

            int numItens = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            double totalGasto = 0.0;
            for (int i = 0; i < numItens; i++) { //aqui complexidade maxima depende do numero de itens chamamos de I
                String[] infoItem = scanner.nextLine().split(" ");
                String nomeItem = infoItem[0];
                int quantidade = Integer.parseInt(infoItem[1]);
                double precoItem = getPrecoProduto(nomeItem, nomesProdutos, precosProdutos);
                totalGasto += precoItem * quantidade;
            }

            System.out.printf("R$ %.2f%n", totalGasto);
        }

        scanner.close();
    }

    private static double getPrecoProduto(String nomeItem, String[] nomesProdutos, double[] precosProdutos) {
        for (int i = 0; i < nomesProdutos.length; i++) {
            if (nomesProdutos[i].equals(nomeItem)) {
                return precosProdutos[i];
            }
        }
        return 0.0; // Produto não encontrado, retorna um valor padrão
    }
}