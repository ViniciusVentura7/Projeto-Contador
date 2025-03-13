
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite agora o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

        contar(parametroUm, parametroDois);

    }

    static void contar(int parametroUm, int parametroDois) {
        if (parametroUm < parametroDois) {
            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Parametros invalidos");
        }
    }
}
