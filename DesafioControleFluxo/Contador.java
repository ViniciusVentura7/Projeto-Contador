
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite agora o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

        System.out.println("---------------------------------------------------------");

        try {

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidoException exception) {
            System.err.println("O segundo parâmetro deve ser MAIOR que o primeiro.");
        }

    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidoException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidoException("O segundo parâmetro deve ser MAIOR que o primeiro.");
        }

        System.out.println("Iniciando contagem: ");

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }

    }
}
