import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactManager {

    public static void main(final String[] args) {

        final Scanner reader = new Scanner(System.in);
        final MenuHandler menuHandler = new MenuHandler();
        int choice;
        do {
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Procurar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Sair");
            System.out.print(">>> ");
            choice = getValidChoice(reader);

            try {
                final MenuOption option = MenuOption.from(choice);
                menuHandler.handle(option);
            } catch (IllegalArgumentException ex) {
                System.out.println("Escolha invalida. Tente novamente.");
            }
        } while (choice != MenuOption.EXIT.getValue());
    }

    private static int getValidChoice(final Scanner scanner) {
        while (true) {
            try {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.println("Escolha inválida. Por favor, insira um número entre 1 e 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
            }
        }
    }

}
