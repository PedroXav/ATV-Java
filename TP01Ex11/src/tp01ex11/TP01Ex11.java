/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex11;

/**
 *
 * @author sumer
 */

/*11- A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double diametro, raio, area;

        System.out.print("Digite o diametro do circulo: ");
        
        diametro = ler.nextDouble();
        raio = diametro / 2.0;
        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo e: " + area);
        ler.close();
    }
    
}
