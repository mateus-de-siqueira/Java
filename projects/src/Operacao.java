import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {
        String operacao = "+";
        int n1;
        int n2;
        int result;

        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a operação a ser realizada (+, - ou *):");
        operacao = ler.next();

        System.out.println("Entre com o primeiro número:");
        n1 = ler.nextInt();

        System.out.println("Entre com o segundo número:");
        n2 = ler.nextInt();

        switch (operacao) {
            case "+":
                result = (n1 + n2);
                System.out.println("O resultado da operação é: " + result);
                break;
            case "-":
                result = (n1 - n2);
                System.out.println("O resultado da operação é: " + result);
                break;
            case "*":
                result = (n1 * n2);
                System.out.println("O resultado da operação é: " + result);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
