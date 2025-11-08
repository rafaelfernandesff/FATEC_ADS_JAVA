import java.util.Scanner;

public class SomaVet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[5];
        int [] b = new int[5];
        int [] c = new int[5];

        System.out.println("Digite os valores para o primeiro vetor:");
        for (int i=0; i<5; i++){
            System.out.print("posicao " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores para o segundo vetor:");
        for (int i=0; i<5; i++){
            System.out.print("posicao " + i + ": ");
            b[i] = sc.nextInt();
        }

        for (int i=0; i<5; i++){
            c[i] = a[i] + b[i];
        }
        
        System.out.println("\nValores da lista de somas: ");

        for (int i=0; i<5; i++){
            System.out.println("posicao " + i + ": " + c[i]);
        }

        sc.close();
    }
}