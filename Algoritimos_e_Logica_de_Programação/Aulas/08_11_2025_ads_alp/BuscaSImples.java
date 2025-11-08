import java.util.Scanner;

public class BuscaSImples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v [] = new int[5];
        int i, x; // "i" é o contador e "x" é o valor que vai ser procurado
        boolean achou = false;

        System.out.println("Entre com os valores do vetor:");
        for (i = 0; i<5; i++ ){
            System.out.print("posicao " + i + ": ");
            v[i] = sc.nextInt(); 
        }

        System.out.print("Digite o valor para a busca: ");
        x = sc.nextInt();

        for (i = 0; i<5 && !achou; i++){
            if(v[i] == x){
                achou = true;
            }
        }
        
        
        if (achou) {
            System.out.println(x + " esta no vetor");
        }
        else {
            System.out.println(x + " nao esta no vetor");
        }



        sc.close();
    }
}
