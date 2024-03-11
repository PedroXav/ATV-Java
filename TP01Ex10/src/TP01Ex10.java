/*10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = ler.nextDouble();
        
       
        double fahrenheit = (9.0/5.0) * celsius + 32;
        
        
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit.", celsius, fahrenheit);
        
        
        ler.close();
    }
}

