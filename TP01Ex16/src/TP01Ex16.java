/*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite o valor do angulo em graus: ");
        double anguloGraus = ler.nextDouble();
        
        
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1.0 / cosseno; 
        
       
        System.out.printf("Seno: %.2f\n", seno);
        System.out.printf("Cosseno: %.2f\n", cosseno);
        System.out.printf("Tangente: %.2f\n", tangente);
        System.out.printf("Secante: %.2f\n", secante);
        
        
        ler.close();
    }
}

