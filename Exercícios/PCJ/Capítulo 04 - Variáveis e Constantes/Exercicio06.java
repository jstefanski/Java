/*
 * Crie um novo aplicativo, chamado Exercicio6, que solicite dois dados ao seu usuário: o seu peso e a sua altura. Estes
 * dados dever ser captados na própria janela de comando. Tanto o peso quanto a altura dever ser armazenados em variáveis
 * do tipo double. A tarefa do aplicativo é calcular o IMC (Índice de Massa Corporal) do usuário. A fórmula que deve ser
 * utilizada para este cálculo é a seguinte:
 * IMC = P / A²
 *
 * Onde:
 * P = Peso
 * A = Altura
 *
 * A figura 4.14 ilustra as saídas que dever ser produzidas por este aplicativo.
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        double altura, peso, imc;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu Peso: \t");
        peso = scan.nextDouble();

        System.out.print("Informe sua Altura: \t");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC: \t" + imc);
    }
}
