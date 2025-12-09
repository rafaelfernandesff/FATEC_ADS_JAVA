import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[10];
        int contpares = 0;

        for (int i = 0; i < vet.length; i ++) {
            vet[i] = sc.nextInt();
        } 
        sc.close();

        for (int j = 0; j < vet.length; j ++) {
            if (vet[j] % 2 == 0) {
                System.out.println(vet[j]);
                contpares ++;
            }
        }

        System.out.println("Sao " + contpares + " pares");
    }
}
