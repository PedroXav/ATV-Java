/*18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.

Maria Eduarda Fodor CB3026063
Pedro Xavier Oliveira CB3027376
*/

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double somaProdutos = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor do produto " + i + ": ");
            double valorProduto = ler.nextDouble();
            somaProdutos += valorProduto;
        }
        
        
        System.out.print("Digite o valor pago pelo cliente: ");
        double valorPago = ler.nextDouble();
        
        
        double troco = valorPago - somaProdutos;
        
        
        if (troco < 0) {
            System.out.println("Valor pago insuficiente.");
        } else {
            System.out.printf("O troco a ser devolvido e: R$%.2f\n", troco);
        }
        
        
        ler.close();
    }
}
