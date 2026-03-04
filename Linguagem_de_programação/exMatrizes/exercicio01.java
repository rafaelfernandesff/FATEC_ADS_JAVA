import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matInt = new int[4][4];
        int soma = 0;
        
        for (int i = 0; i < matInt.length; i ++) {
            for (int j = 0; j < matInt.length; j ++){
                matInt[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matInt.length; i ++) {
            for (int j = 0; j < matInt.length; j ++){
                soma += matInt[i][j]; 
            }
        }

        System.out.println(soma);


        sc.close();   
    }
}
