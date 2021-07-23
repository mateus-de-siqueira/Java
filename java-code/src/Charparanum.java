import java.util.Scanner;

public class Charparanum {
    public static void main(String[] args) {
        char a;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o caracter a ser verificado:");
        a = ler.findInLine(".").charAt(0);
        int trans = Character.getNumericValue(a);

        if (trans >= 0 && trans <= 9) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
