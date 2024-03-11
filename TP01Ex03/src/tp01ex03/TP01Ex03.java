/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex03;

/**
 *
 * @author sumer
 */

/*3- Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double diagonal, area;
        
        System.out.printf("Digite o valor da diagonal do quadrado: ");
        diagonal = ler.nextDouble();
        
        area = (diagonal * diagonal) /2;
        
        System.out.println("A area do quadrado e: " + area);
        ler.close();
    }
    
}
