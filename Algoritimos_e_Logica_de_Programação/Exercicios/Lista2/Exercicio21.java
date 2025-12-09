import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetA = new int[10];
        int [] vetB = new int[10];
        int [] vetC = new int[10];

        System.out.println("Insira todos o valores do vetor A");

        for (int i = 0; i < vetA.length; i ++){
            vetA[i] = sc.nextInt();
        }

        System.out.println("Insira todos o valores do vetor B");

        for (int i = 0; i < vetB.length; i ++){
            vetB[i] = sc.nextInt();
        }

        sc.close();

        for (int j = 0; j < vetC.length; j ++){
            vetC[j] = vetA[j] - vetB[j];
        }

        System.out.println("A subtracao de cada valor entre A e B eh");

        for (int k = 0; k < vetC.length; k ++) {
            System.out.println(vetA[k] + " - " + vetB[k] + " = " + vetC[k]);
        }

        
    }
}
