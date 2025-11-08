import java.util.Scanner;

public class Exercicio_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do cateto a:");
        double a = sc.nextDouble();
        System.out.println("Valor do cateto b:");
        double b = sc.nextDouble();
        sc.close();

        double hipo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("Hipotenusa é: %.2f\n", hipo);

    }

}
