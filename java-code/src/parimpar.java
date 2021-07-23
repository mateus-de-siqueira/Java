import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        n = ler.nextInt();

        if (n % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
