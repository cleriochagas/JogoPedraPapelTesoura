import java.util.Random;
import java.util.Scanner;

public class JogoPedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha uma opção:");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");

        System.out.print("Sua escolha: ");
        int escolhaUsuario = scanner.nextInt();

        if (escolhaUsuario < 0 || escolhaUsuario > 2) {
            System.out.println("Escolha inválida. Encerrando o jogo.");
            return;
        }

        int escolhaComputador = random.nextInt(3);

        System.out.println("Escolha do computador: " + escolhaComputador);

        System.out.println("Você escolheu: " + opcaoJogo(escolhaUsuario));
        System.out.println("O computador escolheu: " + opcaoJogo(escolhaComputador));

        determinarVencedor(escolhaUsuario, escolhaComputador);

        scanner.close();
    }

    public static String opcaoJogo(int escolha) {
        switch (escolha) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";
            default:
                return "Opção inválida";
        }
    }

    public static void determinarVencedor(int escolhaUsuario, int escolhaComputador) {
        if (escolhaUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                   (escolhaUsuario == 1 && escolhaComputador == 0) ||
                   (escolhaUsuario == 2 && escolhaComputador == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
}
