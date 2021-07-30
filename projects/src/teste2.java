import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class teste2 {

    public static void main(String[] args) throws IOException {

        int qtd;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner read = new Scanner(System.in);
        System.out.println("Quantas clientes deseja cadastrar?");
        qtd = read.nextInt();

        String[][] clienteste = new String[qtd][3];

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do cliente: ");
            clienteste[i][0] = reader.readLine();
        }

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < qtd; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(clienteste[i][j] + " ");
            System.out.println();
        }

    }
}
