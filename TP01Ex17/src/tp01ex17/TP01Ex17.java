/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex17;

/**
 *
 * @author sumer
 */

/*17- Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x, y, resultado;
        
        System.out.print("Digite o valor de X: ");
        x = ler.nextDouble();

        System.out.print("Digite o valor de Y: ");
        y = ler.nextDouble();

        resultado = Math.exp(y * Math.log(x));

        System.out.println("O resultado de " + x + " elevado a " + y + " e: " + resultado);
        ler.close();
    }
    
}
