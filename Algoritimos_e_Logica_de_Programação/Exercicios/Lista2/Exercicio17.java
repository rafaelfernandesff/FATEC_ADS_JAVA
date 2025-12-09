import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[10];

        for (int i = 0; i < vet.length; i ++) {
            vet[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 0; j < vet.length; j ++){
            if (vet[j] < 0){
                vet[j] = 0;
            }
        }

        for (int k = 0; k < vet.length; k ++) {
            System.out.println(vet[k]);
        }
    }
}
