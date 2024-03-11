/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex07;

/**
 *
 * @author sumer
 */

/*7- Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double valor1, valor2, mediaGeometrica;
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = ler.nextDouble();

        mediaGeometrica = Math.sqrt(valor1 * valor2);

        System.out.println("A media geometrica e: " + mediaGeometrica);
        ler.close();
    }
    
}
