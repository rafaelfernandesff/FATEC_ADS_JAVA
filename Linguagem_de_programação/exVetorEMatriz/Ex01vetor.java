import java.util.Scanner;

public class Ex01vetor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] Num = new int[10];
		int[] Divis = new int[5];
		int valordiv = 0;
		int indice = 0;
		
		
		System.out.println("Insira os valores do primeiro vetor");
		for (int i = 0; i < Num.length; i ++) {
			Num[i] = sc.nextInt();
		}
		System.out.println("Insira os valores do segundo vetor");
		for (int i = 0; i < Divis.length; i ++) {
			Divis[i] = sc.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i < Num.length; i ++) {
			System.out.println("Numero " +  Num[i]);
			int temDiv = 0;
			for (int j = 0; j < Divis.length; j ++) {
				if (Num[i] % Divis[j] == 0) {
					temDiv = 1;
					indice = j + 1;
					valordiv = Divis[j];
					System.out.println("Divisivel por " + valordiv + " na posicao " + indice);
				} 
			}
			
			if (temDiv == 0) {
				System.out.println("Nao possui divisores no segundo vetor");
			}
		}
		


		sc.close();
	}
}