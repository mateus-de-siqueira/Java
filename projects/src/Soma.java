import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int soma;
        Scanner ler = new Scanner(System.in);

        while (n1 >= 0) {
            System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
            n2 = n1 + n2;
            n1 = ler.nextInt();
        }
        System.out.println("A soma é: " + n2);
    }
}
