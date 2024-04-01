/*Nome: Maria Eduarda Fodor CB3025063
  Nome: Pedro Xavier Oliveira CB3027376
 */

/* 3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos; */

import java.util.Scanner;

public class TP02Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char continuar = 'S';

        do {
            System.out.println("Digite a quantidade de valores (positiva e menor que 20):");
            int quantidadeValores = ler.nextInt();

            if (quantidadeValores <= 0 || quantidadeValores >= 20) {
                System.out.println("Quantidade invalida. Por favor, digite novamente.");
                continue; // Volta ao início do loop para nova entrada
            }

            int[] valores = new int[quantidadeValores];

            for (int i = 0; i < quantidadeValores; i++) {
                System.out.println("Digite o valor #" + (i + 1) + ":");
                valores[i] = ler.nextInt();
            }

            int maior = valores[0];
            int menor = valores[0];
            int soma = 0;
            int positivos = 0;
            int negativos = 0;

            for (int valor : valores) {
                soma += valor;
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > 0) {
                    positivos++;
                } else if (valor < 0) {
                    negativos++;
                }
            }

            double media = (double) soma / quantidadeValores;
            double porcentagemPositivos = (double) positivos / quantidadeValores * 100;
            double porcentagemNegativos = (double) negativos / quantidadeValores * 100;

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Media aritmetica dos valores: " + media);
            System.out.println("Porcentagem de valores positivos: " + porcentagemPositivos + "%");
            System.out.println("Porcentagem de valores negativos: " + porcentagemNegativos + "%");

            System.out.println("Deseja continuar? (S/N):");
            continuar = ler.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        ler.close(); // Fechar o scanner ao encerrar o programa
    }
}
