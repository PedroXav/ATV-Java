import java.util.Scanner;

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        int[][] matriz = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        
        System.out.print("Digite a constante multiplicativa: ");
        int constante = ler.nextInt();

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }

        
        System.out.println("\nMatriz Original:");
        exibirMatriz(matriz);

        ler.close();
    }

    
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

