/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex15;

/**
 *
 * @author sumer
 */

/*15- Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double cotacaoDolar, quantidadeDolares, valorEmReais;
        
        System.out.print("Digite a cotacao do dolar: ");
        cotacaoDolar = ler.nextDouble();

        System.out.print("Digite a quantidade de dolares: ");
        quantidadeDolares = ler.nextDouble();

        valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor em Reais e: R$ " + valorEmReais);

        ler.close();
    }
    
}
