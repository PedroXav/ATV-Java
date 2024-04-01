/*Nome: Maria Eduarda Fodor CB3025063
  Nome: Pedro Xavier Oliveira CB3027376
 */

/* 10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas). */

import java.util.Scanner;

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        System.out.print("Digite a ordem da matriz (ate 10): ");
        int ordem = ler.nextInt();

        
        if (ordem <= 0 || ordem > 10) {
            System.out.println("Ordem invalida. Digite um numero entre 1 e 10.");
            ler.close(); 
            return;
        }

        
        double[][] matriz = new double[ordem][ordem];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = ler.nextDouble();
            }
        }

        
        System.out.println("\nMatriz Original:");
        exibirMatriz(matriz);

        System.out.println("\nMatriz Inversa (Matriz Identidade):");
        exibirMatriz(criarMatrizIdentidade(ordem));

        ler.close(); 
    }

    
    public static double[][] criarMatrizIdentidade(int ordem) {
        double[][] identidade = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            identidade[i][i] = 1;
        }
        return identidade;
    }

    
    public static void exibirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println(); 
        }
    }
}
