import java.util.Scanner;

class ExerciciosFixaçãoModulo1Ex6 {

    public static void main(String[] args) {
        int x = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza um valor a ser calculado: ");
        x = ler.nextInt();

        do {
            System.out.println(x + ",");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
        } while (x > 1);

        System.out.println(x);
    }
}
