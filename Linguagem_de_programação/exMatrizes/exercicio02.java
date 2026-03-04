import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matIntA = new int[2][2];
        int[][] matIntB = new int[2][2];
        int[][] matIntC = new int[2][2];

         for (int i = 0; i < matIntA.length; i ++) {
            for (int j = 0; j < matIntA.length; j ++){
                matIntA[i][j] = sc.nextInt();
            }
        }

         for (int i = 0; i < matIntB.length; i ++) {
            for (int j = 0; j < matIntB.length; j ++){
                matIntB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matIntC.length; i ++) {
            for (int j = 0; j < matIntC.length; j ++){
                matIntC[i][j] = matIntA[i][j] + matIntB[i][j];                
            }
        }

        for (int i = 0; i < matIntB.length; i ++) {
            for (int j = 0; j < matIntB.length; j ++){
                System.out.print(matIntC[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
