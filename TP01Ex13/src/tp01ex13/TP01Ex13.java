/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex13;

/**
 *
 * @author sumer
 */

/*13- Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double velocidadeInicial, aceleracao, tempo, velocidadeFinal;
         
        System.out.print("Digite a velocidade inicial (em m/s): ");
        velocidadeInicial = ler.nextDouble();

        System.out.print("Digite a aceleraçao (em m/s²): ");
        aceleracao = ler.nextDouble();

        System.out.print("Digite o tempo de percurso (em s): ");
        tempo = ler.nextDouble();
        
        velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        velocidadeFinal = velocidadeFinal * 3.6;

        System.out.println("A velocidade final do automovel é: " + velocidadeFinal + " km/h");

        ler.close();
    }
    
}
