/*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite o raio da esfera (r): ");
        double raio = ler.nextDouble();
        
        
        System.out.print("Digite a aresta do cubo (a): ");
        double aresta = ler.nextDouble();
        
        
        double volumeCubo = Math.pow(aresta, 3);
        
        
        double volumeEsfera = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
        
        
        double volumeLivre = volumeCubo - volumeEsfera;
        
        
        System.out.printf("O volume livre no ambiente e: %.2f", volumeLivre);
        
        
        ler.close();
    }
}

