import java.util.Scanner;

public class exMetod02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[20];
        int busca;

        System.out.println("Insira o valor a ser buscado");
        busca = sc.nextInt();

        System.out.println();

        System.out.println("Agora insira os 20 valores do vetor");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }

        imprimirQuadro(busca, vet, verificarDois(vet, busca));

        sc.close();
    }

    public static int verificarDois(int[] x, int y) {
        int cont = 0;
        int flag;
        for (int i = 0; i < x.length; i++) {
            if (y == x[i]) {
                cont ++;
            }
        }
        if (cont == 2) {
            flag = 1;
        }
        else {
            flag = 0;
        }

        return flag;
    }

    public static void imprimirQuadro(int busca, int[] vetor, int flag) {
        if (flag == 1) {
            System.out.println("Numero digitado" + "    " + "Vetor" + "                      " + "Retorno" + "   " + "Mensagem");
            System.out.print(busca + "    ");
            System.out.print('[');
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + ", ");
            }
            System.out.print("]   ");
            System.out.print(flag + " ");
            System.out.println("Aparece duas vezes no vetor");
        }
        else {
            System.out.println("Numero digitado" + "    " + "Vetor" + "                      " + "Retorno" + "   " + "Mensagem");
            System.out.print(busca + "    ");
            System.out.print('[');
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + ", ");
            }
            System.out.print("]   ");
            System.out.print(flag + " ");
            System.out.println("Nao aparece duas vezes no vetor");
        }
    }
}
