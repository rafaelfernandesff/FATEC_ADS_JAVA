import java.util.Scanner;

public class exercicio07{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[5];
		int quant = 0;
		
		int i = 0;
		while (i < vet.length) {
			vet[i] = sc.nextInt();
			if (vet[i] % 5 == 0) {
				i++;
			} else {
				quant ++;
			}		
		}

		System.out.println();
		for (int k =0; k < vet.length; k++) {
			System.out.print(vet[k] + " ");
		}
		
		System.out.println();
		System.out.println(quant);
		
		
		sc.close();
	}
}