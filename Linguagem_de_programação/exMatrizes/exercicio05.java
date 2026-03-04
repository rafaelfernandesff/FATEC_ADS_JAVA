import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];

        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++){
                if ((i + j) % 2 == 0 ) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
