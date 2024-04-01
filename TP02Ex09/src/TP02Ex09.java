/*Nome: Maria Eduarda Fodor CB3025063
  Nome: Pedro Xavier Oliveira CB3027376
 */

 /* 9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta. */

import java.util.Scanner;

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de linhas da matriz (M):");
        int linhas = scanner.nextInt();
        System.out.println("Digite o numero de colunas da matriz (N):");
        int colunas = scanner.nextInt();

        if (linhas <= 0 || linhas > 10 || colunas <= 0 || colunas > 10) {
            System.out.println("A ordem da matriz deve ser no maximo 10x10 e positiva.");
            scanner.close(); // Fechar o scanner antes de retornar
            return;
        }

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz original:");
        exibirMatriz(matriz);

        System.out.println("Matriz transposta:");
        int[][] transposta = calcularTransposta(matriz);
        exibirMatriz(transposta);

        scanner.close(); // Fechar o scanner ao final do programa
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] calcularTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
}
