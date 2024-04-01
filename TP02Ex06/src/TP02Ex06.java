public class TP02Ex06 {
    public static void main(String[] args) {
        
        String[][] nomes = new String[2][3];

       
        nomes[0][0] = "Alice";
        nomes[0][1] = "Bob";
        nomes[0][2] = "Carlos";
        nomes[1][0] = "Daniela";
        nomes[1][1] = "Eduardo";
        nomes[1][2] = "Fernanda";

        
        System.out.println("Nomes na matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nomes[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

