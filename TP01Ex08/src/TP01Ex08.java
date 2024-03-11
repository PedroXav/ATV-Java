/*8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite o numero de milhas maritimas: ");
        double milhasMaritimas = ler.nextDouble();
        
        
        double quilometros = milhasMaritimas * 1852 / 1000;
        
        
        System.out.printf("%.2f milhas maritimas equivalem a %.2f quilometros.", milhasMaritimas, quilometros);
        
        
        ler.close();
    }
}

