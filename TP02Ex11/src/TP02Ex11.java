/*Nome: Maria Eduarda Fodor CB3025063
  Nome: Pedro Xavier Oliveira CB3027376
 */

/* 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz. */

import java.util.Scanner;

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz (MxM, maximo 10): ");
        int ordem = ler.nextInt();

        if (ordem < 1 || ordem > 10) {
            System.out.println("Ordem invalida! Por favor, escolha um valor entre 1 e 10.");
            ler.close(); // Fechar o scanner antes de retornar
            return;
        }

        double[][] matriz = new double[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = ler.nextDouble();
            }
        }

        System.out.println("Matriz inserida:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        double determinante = calcularDeterminante(matriz);
        System.out.println("O determinante da matriz e: " + determinante);

        ler.close(); // Fechar o scanner ao final do programa
    }

    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;

        if (ordem == 1) {
            return matriz[0][0];
        }

        if (ordem == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        double determinante = 0;

        for (int coluna = 0; coluna < ordem; coluna++) {
            determinante += matriz[0][coluna] * cofator(matriz, 0, coluna);
        }

        return determinante;
    }

    public static double cofator(double[][] matriz, int linha, int coluna) {
        return Math.pow(-1, linha + coluna) * calcularDeterminante(submatriz(matriz, linha, coluna));
    }

    public static double[][] submatriz(double[][] matriz, int linhaEliminar, int colunaEliminar) {
        int ordem = matriz.length;
        double[][] submatriz = new double[ordem - 1][ordem - 1];

        int iSub = 0, jSub;

        for (int i = 0; i < ordem; i++) {
            if (i == linhaEliminar) continue;

            jSub = 0;
            for (int j = 0; j < ordem; j++) {
                if (j == colunaEliminar) continue;

                submatriz[iSub][jSub] = matriz[i][j];
                jSub++;
            }
            iSub++;
        }

        return submatriz;
    }
}
