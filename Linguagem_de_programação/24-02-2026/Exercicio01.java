import java.util.Scanner;

public class Exercicio01{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
 		int [] vet = new int[15];
		int [] vet2 = new int[15];
		
		for (int i = 0;i < vet.length;i ++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i = 0;i < vet.length;i ++) {
			vet2[i] = vet[i] * 3;
		}
		
		System.out.println();
		for (int i = 0;i < vet.length;i ++) {
			System.out.print(vet2[i] + " " );
		}

		
		sc.close();
		
	}
}