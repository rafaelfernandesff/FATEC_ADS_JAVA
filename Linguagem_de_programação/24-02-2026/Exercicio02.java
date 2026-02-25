import java.util.Scanner;

public class Exercicio02{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int [] vet = new int[5];
		int maior;
		
		for (int i = 0;i < vet.length;i ++) {
			vet[i] = sc.nextInt();
		}
		
		maior = vet[0];
		
		for (int i = 1;i < vet.length;i ++) {
			if (maior < vet[i]) {
				maior = vet[i];
			}
		}
		
		System.out.println();
		System.out.println(maior);
		
		sc.close();
	}
}