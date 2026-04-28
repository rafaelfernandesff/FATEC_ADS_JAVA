import java.util.Scanner;

public class exMetod03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite um valor entre 1 a 3: ");
            n = sc.nextInt();

            if(n < 1 || n > 3) {
                System.out.println("Valor invalido");
            }
        } while (n < 1 || n > 3);

        switch (n) {
            case 1:
                System.out.println("Digite uma frase: ");
                String frase = sc.nextLine();
                metodo1();
                break;
            case 2:
                metodo2();
                break;
            case 3:
                metodo3();
                break;
        }



        sc.close();
    }

    public static void metodo1(String string) {
        int cont = 0;
    }

}
