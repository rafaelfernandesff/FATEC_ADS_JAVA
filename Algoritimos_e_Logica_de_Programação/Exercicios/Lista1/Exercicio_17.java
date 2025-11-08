import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o comprimento em cm?");
        double cm = sc.nextDouble();
        sc.close();
        System.out.printf("Em polegadas fica: %.2f polegadas\n", (cm/2.54));
    }
}
