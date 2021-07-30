import java.util.Scanner;

public class Maiornum {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int maior = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Entre com o segundo numero: ");
        n2 = ler.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        n3 = ler.nextInt();
        System.out.println("Entre com o quarto numero: ");
        n4 = ler.nextInt();
        System.out.println("Entre com o quinto numero: ");
        n5 = ler.nextInt();

        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }

        if (maior > n3) {
            maior = maior;
        } else {
            maior = n3;
        }

        if (maior > n4) {
            maior = maior;
        } else {
            maior = n4;
        }

        if (maior > n5) {
            maior = maior;
        } else {
            maior = n5;
        }
        System.out.println(maior);
    }
}
