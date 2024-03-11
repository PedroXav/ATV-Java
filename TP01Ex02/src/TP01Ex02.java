/* 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) throws Exception {
          Scanner ler = new Scanner (System.in);
        int L1 , A, Q;
        
        System.out.printf ("Informe a aresta do Quadrado:");
        A = ler.nextInt ();
        L1 = A;
        Q = L1 * L1;
        
        
        System.out.println ("A area do quadrado e:" + Q);
        ler.close();
    }
}
