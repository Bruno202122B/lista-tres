import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeUsuario, senhaUsuario;

        do {
            System.out.print("Digite o nome do seu usuário: ");
            nomeUsuario = input.nextLine();

            System.out.print("Insira sua senha: ");
            senhaUsuario = input.nextLine();

            if (senhaUsuario.equals(nomeUsuario)) {
                System.out.println("Senha igual ao nome de usuário! Tente novamente.");
            }
        } while (senhaUsuario.equals(nomeUsuario));

        System.out.println("Nome do usuário e senha aceitos!");
    }
}








