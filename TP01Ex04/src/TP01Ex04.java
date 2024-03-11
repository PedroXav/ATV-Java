/*4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) throws Exception {
          Scanner ler = new Scanner (System.in);
        int B, A, a;
        
        System.out.printf ("Informe o valor da base por favor:");
       B = ler.nextInt(); 
       
       System.out.printf ("Informe o valor da altura por favor:");
       A = ler.nextInt();
       
       a = (B * A) / 2;
       
       System.out.println ("A area do triangulo e:" + a);
       ler.close();
    }
}    