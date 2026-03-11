import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeUm = sc.nextLine();
        String nomeDois = sc.nextLine();
        
        System.out.println(nomeUm);
        System.out.println(nomeDois);
        System.out.println(nomeUm.charAt(1));
        System.out.println(nomeDois.charAt(1));

        sc.close();
    }
}
