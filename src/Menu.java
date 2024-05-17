import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void mostraMenu(){
        System.out.println("""
                ******************************************************
                Seja bem-vindo/a ao Conversor de Moeda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileiro
                4) Real brasileiro =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Sair
                Escolha uma opção válida:
                ******************************************************""");
                /*try {
                    verificaOpcao(escolherOpcao());
                } catch (InputMismatchException e){
                    System.out.println("Esse menu só aceita números!");
                }*/
    }

    public int escolherOpcao(){
        Scanner leitura = new Scanner(System.in);
        return leitura.nextInt();
    }

    public void verificaOpcao(int opcaoSelecionada, String urlExchange, double valorInicial) throws IOException, InterruptedException {
        if (opcaoSelecionada == 1){
            String moedaBase = "USD";
            String moedaAlvo = "ARS";
            String urlPesquisada = urlExchange + moedaBase + "/" + moedaAlvo + "/" + valorInicial;
            PuxarJsonMoedas puxarJsonMoedas = new PuxarJsonMoedas(urlPesquisada);
        }else if (opcaoSelecionada == 2){
            String moedaBase = "ARS";
            String moedaAlvo = "USD";
            String urlPesquisada = urlExchange + moedaBase + "/" + moedaAlvo + "/" + valorInicial;
            PuxarJsonMoedas puxarJsonMoedas = new PuxarJsonMoedas(urlPesquisada);
        }else if (opcaoSelecionada == 3){
            String moedaBase = "USD";
            String moedaAlvo = "BRL";
            String urlPesquisada = urlExchange + moedaBase + "/" + moedaAlvo + "/" + valorInicial;
            PuxarJsonMoedas puxarJsonMoedas = new PuxarJsonMoedas(urlPesquisada);
        }else if (opcaoSelecionada == 4){
            String moedaBase = "BRL";
            String moedaAlvo = "USD";
            String urlPesquisada = urlExchange + moedaBase + "/" + moedaAlvo + "/" + valorInicial;
            PuxarJsonMoedas puxarJsonMoedas = new PuxarJsonMoedas(urlPesquisada);
        }else if (opcaoSelecionada == 5){
            String moedaBase = "USD";
            String moedaAlvo = "COP";
            String urlPesquisada = urlExchange + moedaBase + "/" + moedaAlvo + "/" + valorInicial;
            PuxarJsonMoedas puxarJsonMoedas = new PuxarJsonMoedas(urlPesquisada);
        }else if (opcaoSelecionada == 6){
            String moedaBase = "USD";
            String moedaAlvo = "COP";
            String urlPesquisada = urlExchange + moedaBase + "/" + moedaAlvo + "/" + valorInicial;
            PuxarJsonMoedas puxarJsonMoedas = new PuxarJsonMoedas(urlPesquisada);
        }else if (opcaoSelecionada == 7){

        } else {
            System.out.println("Opção Inválida");
        }
    }
}
