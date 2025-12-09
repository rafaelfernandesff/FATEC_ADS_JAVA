import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[10];
        int maiorElemento = vet[0];
        int posicao = 0;
        for (int i = 0; i < vet.length; i ++) {
            vet[i] = sc.nextInt();
        } 
        sc.close();

        for (int j = 0; j < vet.length; j ++){
            if (maiorElemento < vet[j]) {
                maiorElemento = vet[j];
                posicao = j;
            }
        }

        for (int k = 0; k < vet.length; k ++) {
            System.out.println(vet[k]);
        }

        System.out.println("o maior elemento eh " + maiorElemento);
        System.out.println("esta na posicao " + posicao);

    }
}
