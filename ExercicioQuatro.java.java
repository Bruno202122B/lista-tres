import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            soma += numero;
        }

        double media = soma / 5.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}

