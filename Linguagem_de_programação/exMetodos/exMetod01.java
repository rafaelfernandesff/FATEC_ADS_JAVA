import java.util.Scanner;

public class exMetod01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Digites valores inteiros da matriz 10x10");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sua matriz");
        imprimirMatriz(mat);
        System.out.println();
        System.out.println("Abaixo da diagonal principal");
        imprimirAbaixoDiagP(mat);
        System.out.println();
        System.out.println("soma da diagonal secundaria par/impar");
        System.out.println(avaliarSomaDiagS(mat));

        sc.close();
    }


    public static void imprimirMatriz(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirAbaixoDiagP (int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i > j) {
                    System.out.print(x[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static char avaliarSomaDiagS(int[][] x) {
        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (j + i == x.length - 1) {
                    soma += x[i][j];
                }
            }
        }
        if (soma % 2 == 0) {
            return 'V';
        }

        return 'F';
    }


}
