import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        while (nome.length() <= 3) {
            System.out.print("Nome inválido. Digite novamente: ");
            nome = sc.nextLine();
        }

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.print("Idade inválida. Digite novamente: ");
            idade = sc.nextInt();
        }

        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();
        while (salario <= 0) {
            System.out.print("Salário inválido. Digite novamente: ");
            salario = sc.nextDouble();
        }

        System.out.print("Digite seu sexo (f/m): ");
        char sexo = sc.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.print("Sexo inválido. Digite novamente (f/m): ");
            sexo = sc.next().charAt(0);
        }

        System.out.print("Digite seu estado civil (s/c/v/d): ");
        char estadoCivil = sc.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.print("Estado civil inválido. Digite novamente (s/c/v/d): ");
            estadoCivil = sc.next().charAt(0);
        }

        System.out.println("Informações válidas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}

