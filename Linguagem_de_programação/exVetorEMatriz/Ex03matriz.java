import java.util.Scanner;

public class Ex03matriz {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[4][4];
		boolean ehTrianguloSuperior = true;
		
		for (int i = 0; i < mat.length; i ++){
			for (int j = 0; j < mat.length; j ++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < mat.length; i ++){
			for (int j = 0; j < mat.length; j ++) {
				if (i > j && mat[i][j] != 0) {
					ehTrianguloSuperior = false;
					break;
				}
			}
			if (!ehTrianguloSuperior) break;
		}
		
		
		System.out.println("\nResultado:");
        if (ehTrianguloSuperior) {
            System.out.println("A matriz É uma matriz triangular superior.");
        } else {
            System.out.println("A matriz NÃO é uma matriz triangular superior.");
        }


		sc.close();
	}
}