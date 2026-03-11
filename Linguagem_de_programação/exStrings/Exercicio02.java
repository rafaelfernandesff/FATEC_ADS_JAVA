import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contVogal = 0;
        String nome = sc.nextLine();
        nome = nome.toLowerCase();

        for (int i = 0; i < nome.length(); i ++) {
            char letra = nome.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contVogal ++;
            }
        }

        System.out.println(contVogal);

        sc.close();
    }
}
