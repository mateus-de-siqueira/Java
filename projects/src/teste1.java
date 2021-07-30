import java.util.Scanner;

public class teste1 {

    public static void main(String[] args) {
        int qtd;
        String[] nomes;

        Scanner read = new Scanner(System.in);
        System.out.println("Quantas clientes deseja cadastrar?");
        qtd = read.nextInt();
        nomes = new String[qtd];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = read.nextLine();
            System.out.print("Digite o nome do cliente: ");
        }

        for (String i : nomes) {
            System.out.println(i);
        }
    }
}
