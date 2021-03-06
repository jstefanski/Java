/*
 * Crie um novo aplicativo chamado Exercicio3, que solicite um número inteiro e calcule o seu quadrado. Tanto a captação
 * do número quanto a exibição do resultado devem ser feitas na própria janela de comando. A figura 4.11 ilustra as saídas
 * que devem ser produzidas por este aplicativo.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número Inteiro: \t");
        int numero = scan.nextInt();
        int quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " é: \t" + quadrado);
    }
}
