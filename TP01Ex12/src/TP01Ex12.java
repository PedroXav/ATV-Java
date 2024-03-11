/*12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex12 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite o raio da base do cone: ");
        double raio = ler.nextDouble();
        
        
        System.out.print("Digite a altura do cone: ");
        double altura = ler.nextDouble();
        
        
        double volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
        
        
        System.out.printf("O volume do cone e: %.2f", volume);
        
        
        ler.close();
    }
}

