import java.util.Scanner;

public class Ex02vetor{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		System.out.println("Insira os valores do vetorA");
		for (int i = 0; i < vetorA.length; i ++) {
			do {
				System.out.println("vetorA[" + i + "]: ");
				vetorA[i] = sc.nextInt();
			} while (vetorA[i] < 1000 || vetorA[i] > 9999);
		}
		

		System.out.println("Insira os valores do vetorB");
		for (int i = 0; i < vetorB.length; i ++) {
			do {
				System.out.println("vetorB[" + i + "]: ");
				vetorB[i] = sc.nextInt();
			} while (vetorB[i] < 10 || vetorB[i] > 99);
		}
		
		System.out.println();
		System.out.println("vetorA	vetorB	mensagem");
		for (int i = 0; i < vetorA.length; i ++) {
				if (vetorA[i] %  100 == vetorB[i]) {
					System.out.println(vetorA[i] + "	 "+ vetorB[i] + " 	"+ "Encaixa");
				} else {
					System.out.println(vetorA[i] + "	 "+ vetorB[i] + "	"+ "Nao encaixa");
				}	
		}
		
		sc.close();
	}
}