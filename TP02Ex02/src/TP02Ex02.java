/*Nome: Maria Eduarda Fodor CB3025063
  Nome: Pedro Xavier Oliveira CB3027376
 */

/* 2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores. */
import java.util.Scanner;

public class TP02Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] valores = new int[10];
        int maiorValor = Integer.MIN_VALUE;
        int soma = 0;

        
        System.out.println("Digite 10 valores positivos:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = ler.nextInt();

            
            if (valor > 0) {
                valores[i] = valor;
                soma += valor;

                
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
            } else {
                System.out.println("Valor invalido! Digite um valor positivo.");
                i--; 
            }
        }

        
        double media = (double) soma / 10;

        
        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media aritmetica dos valores: " + media);

        ler.close();
    }
}
