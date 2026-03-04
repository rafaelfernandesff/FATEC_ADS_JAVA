import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matOrdem5 = new int[5][5];
        int[] diagonalPrincipal = new int[5];
        int[] diagonalSecundaria = new int[5];
        int ordem = 5;

        for (int i = 0; i < matOrdem5.length; i ++) {
            for (int j = 0; j < matOrdem5.length; j ++){
                matOrdem5[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matOrdem5.length; i ++) {
            for (int j = 0; j < matOrdem5.length; j ++){
                if (i == j) {
                    diagonalPrincipal[i] = matOrdem5[i][j];
                }
                if (i + j == (ordem - 1)) {
                    diagonalSecundaria[i] = matOrdem5[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Diagonal Principal");
        for (int i = 0; i < diagonalPrincipal.length; i ++) {
            System.out.print(diagonalPrincipal[i] + " ");
        }

        System.out.println();
        System.out.println("Diagonal secundaria");
        for (int i = 0; i < diagonalSecundaria.length; i ++) {
            System.out.print(diagonalSecundaria[i] + " ");
        }


        sc.close();
    }
}
