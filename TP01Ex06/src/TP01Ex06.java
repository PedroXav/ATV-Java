/*6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double A1, A2, A3, A4, N;
        
        System.out.printf ("Informe o primeiro valor por favor: ");
        A1 = ler.nextInt();
        
        System.out.printf("Informe o segundo valor por favor: ");
        A2 = ler.nextInt();
        
        System.out.printf ("Informe o terceiro valor por favor:");
        A3 = ler.nextInt();
        
        System.out.printf("Informe o quarto valor por favor:");
        A4 = ler.nextInt();
        
        N = (A1+A2+A3+A4) / 4;
        
        System.out.println("A media aritmetica e: " + N);
        ler.close();
    }
}
