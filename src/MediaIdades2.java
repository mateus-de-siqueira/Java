import java.util.Scanner;

public class MediaIdades2 {
    public static void main(String[] args) {
        int i = 0;
        int idade = 0;
        int media;
        int qtd;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas idades serão lidas:");
        qtd = ler.nextInt();

        while (i < qtd) {
            System.out.print("Digite uma idade");
            idade += ler.nextInt();
            i++;
        }
        media = idade / qtd;
        System.out.println("A média das idades digitadas é:" + media);
    }
}