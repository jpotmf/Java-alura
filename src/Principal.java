import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String MY_API_KEY = "e57a9a8bce36d3177d358ace";
        //URI endereco = URI.create("https://v6.exchangerate-api.com/v6/e57a9a8bce36d3177d358ace/pair/EUR/GBP");
        String urlPairConversion = "https://v6.exchangerate-api.com/v6/" + MY_API_KEY + "/pair/";
        Menu menu = new Menu();
        menu.mostraMenu();
        int opcaoEscolhida = menu.escolherOpcao();
        System.out.println("Digite o valor que deseja converter:");
        Scanner leitura = new Scanner(System.in);
        double valorInicial= leitura.nextDouble();
        menu.verificaOpcao(opcaoEscolhida, urlPairConversion, valorInicial);


    }
}