/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex01;

/**
 *
 * @author sumer
 */

/*1- Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double base, altura, area;
        
        System.out.printf("Informe a Base de um Retangulo: ");
        base = ler.nextDouble();
        
        System.out.printf("Informe a Altura de um Retangulo: ");
        altura = ler.nextDouble();
        
        area = base * altura;
        System.out.println("A area do retangulo e: " + area);
        ler.close();
    }
    
}
