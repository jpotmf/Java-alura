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
                try {
                    verificaOpcao(escolherOpcao());
                } catch (InputMismatchException e){
                    System.out.println("Esse menu só aceita números!");
                }
    }

    public int escolherOpcao(){
        Scanner leitura = new Scanner(System.in);
        return leitura.nextInt();
    }

    public void verificaOpcao(int opcaoSelecionada){
        if (opcaoSelecionada == 1){
            String moedaBase = "USD";
            String moedaAlvo = "ARS";
        }else if (opcaoSelecionada == 2){
            String moedaBase = "ARS";
            String moedaAlvo = "USD";
        }else if (opcaoSelecionada == 3){
            String moedaBase = "USD";
            String moedaAlvo = "BRL";
        }else if (opcaoSelecionada == 4){
            String moedaBase = "BRL";
            String moedaAlvo = "USD";
        }else if (opcaoSelecionada == 5){
            String moedaBase = "USD";
            String moedaAlvo = "COP";
        }else if (opcaoSelecionada == 6){
            String moedaBase = "USD";
            String moedaAlvo = "COP";
        }else if (opcaoSelecionada == 7){

        } else {
            System.out.println("Opção Inválida");
        }
    }
}
