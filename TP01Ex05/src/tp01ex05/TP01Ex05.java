/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex05;

/**
 *
 * @author sumer
 */

/*5- Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        double diametro, raio, volume;
        
        System.out.print("Digite o valor do diametro da esfera: ");
        diametro = ler.nextDouble();

        raio = diametro / 2;

        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("O volume da esfera e: " + volume);

        ler.close();
    }
    
}
