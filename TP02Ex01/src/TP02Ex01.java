/*Nome: Maria Eduarda Fodor CB3025063
  Nome: Pedro Xavier Oliveira CB3027376
 */

/* 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.*/

import java.util.Scanner;

public class TP02Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int primeiroValor, segundoValor;

        System.out.println("Digite o 1 valor:");
        primeiroValor = ler.nextInt();

        System.out.println("Digite o 2 valor (maior que o 1):");
        segundoValor = ler.nextInt();

        while (segundoValor <= primeiroValor) {
            System.out.println("O 2 valor deve ser maior que o 12. Digite novamente:");
            segundoValor = ler.nextInt();
        }

        System.out.println("Valores aceitos: " + primeiroValor + ", " + segundoValor);

        ler.close(); 
    }
}
