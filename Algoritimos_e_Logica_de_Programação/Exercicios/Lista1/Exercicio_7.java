import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        double tempF = sc.nextDouble();
        sc.close();
        double tempC = 5.0 * (tempF - 32.0) / 9.0;

        System.out.printf("Temperatura: %.1f C\n", tempC);
    }
}
