import java.net.URI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String MY_API_KEY = "e57a9a8bce36d3177d358ace";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/e57a9a8bce36d3177d358ace/latest/USD");

        Menu menu = new Menu();
        menu.mostraMenu();


    }
}