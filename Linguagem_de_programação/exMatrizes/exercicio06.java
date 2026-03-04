import java.util.Scanner;

public class exercicio06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int contDiag = 0;
        int contRest = 0;

        System.out.println("Digite apenas 0 ou 1, como valores da matriz");
        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++) {
                if (i == j) {
                    if (mat[i][j] == 1) {
                        contDiag ++;
                    }
                } else {
                    if (mat[i][j] == 0) {
                        contRest += mat[i][j];
                    }
                }    
            }
        }

        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++) {
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
        

        if (contDiag == mat.length && contRest == 0) {
            System.out.println("Matriz identidade");
        } else {
            System.out.println("Matriz nao identidade");
        }


        sc.close();
    }
}
