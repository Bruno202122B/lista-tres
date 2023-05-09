import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroUm = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numeroDois = sc.nextInt();

        if (numeroUm < numeroDois) {
            for (int i = numeroUm + 1; i < numeroDois; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = numeroDois + 1; i < numeroUm; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
