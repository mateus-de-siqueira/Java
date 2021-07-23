import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        int idade = 0;
        int media;
        int qtd;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas idades serão lidas:");
        qtd = ler.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite uma idade:");
            // idade = idade + ler.nextIni
            idade += ler.nextInt();
        }
        media = idade / qtd;
        System.out.println("A média das idades digitadas é:" + media);
    }
}
