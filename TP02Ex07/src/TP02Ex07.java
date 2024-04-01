/*Nome: Maria Eduarda Fodor CB3025063
  Nome: Pedro Xavier Oliveira CB3027376
 */

/* 7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/

import java.util.Scanner;

public class TP02Ex07{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        System.out.println("Digite doze valores para preencher a matriz de ordem 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Digite a constante multiplicativa:");
        int constante = ler.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }

        System.out.println("Matriz resultante apos a multiplicacao:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        ler.close();
    }
}

