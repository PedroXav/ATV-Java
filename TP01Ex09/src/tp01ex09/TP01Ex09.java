/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex09;

/**
 *
 * @author sumer
 */

/*9- Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double resistencia, corrente, tensao;
                
        System.out.print("Digite o valor da resistencia (em ohms): ");
        resistencia = ler.nextDouble();

        System.out.print("Digite o valor da corrente eletrica (em amperes): ");
        corrente = ler.nextDouble();

        tensao = corrente * resistencia;

        System.out.println("A tensao e: " + tensao + " volts");

        ler.close();
    }
    
}
