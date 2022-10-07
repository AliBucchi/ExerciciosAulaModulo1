public class ExerciciosFixaçãoModulo1Ex1a5 {

    public static void main(String[] args) {
        //Exercicio 1
        int i = 100;

        for (i= 100; i <= 200; i++) {
            System.out.println("Os numeros são: " + i);
        }

        //Exercicio 2
        int soma_pares = 1;
        for (i= 1; i <= 1000; i++) {
            if (i%2 == 0) {
                soma_pares = soma_pares + i;
            }
        }
        System.out.println("A soma dos pares: " + soma_pares);

        //Exercicio 3
        for (i = 1; i <=100; i++) {
            if (i%5 == 0) {
                System.out.println("Os numeros multiplos de 5 até 100: " + i);
            }
        }

        //Exercicio 4
        int fatorial = 1;
        int k;
        for (i = 1; i <= 6; i++) {
            for (k = i; k >= 1; k--) {
                fatorial = fatorial * k;
            }
            System.out.println("O fatorial de 1 a 6: " + fatorial);
        }

        //Exercicio 5 (Numeros de Fibbonacci)
        // Conceito: Fn = F(n-1) + F(n-2)
        // considerando Fn = posiçãoAtual, F(n-1) = posiçãoAnterior1 e F(n-2) = posiçãoAnterior2

        int posicaoAtual = 1;
        int posicaoAnterior1 = 1;
        int posicaoAnterior2 = 0;

        do {
            posicaoAtual = posicaoAnterior1 + posicaoAnterior2;

            System.out.println("Apresentando o numero a ser calculado: " + posicaoAtual);

            posicaoAnterior2 = posicaoAnterior1;
            posicaoAnterior1 = posicaoAtual;

        } while (posicaoAtual < 50);
    }
}
