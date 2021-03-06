/*
 * Crie um novo aplicativo, chamado Exercicio1, que solicite trÊs dados ao seu usuário: seu nome completo, seu sexo e sua
 * renda familiar. Todos estes dados devem ser captados na própria janela de comando e, para isso, você deve utilizar a
 * classe java.util.Scanner. O nome deve ser armazenado em um objeto do tipo String, o sexo deve ser armazenado em uma
 * variável do tipo char e a renda familiar deve ser armazenada em uma variável do tipo double. Ao final, o aplicativo deve
 * imprimir os três dados informados no mesmo formato em que se apresentam na Figura 4.9.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("Informe seus dados\n");
        System.out.print("Nome Completo: \t");
        String nome = scan.nextLine();

        System.out.print("Sexo (M ou F): \t");
        String sexo_string = scan.nextLine();
        char sexo = sexo_string.charAt(0);

        System.out.print("Renda Familiar: ");
        double renda = scan.nextDouble();

        System.out.println();
        System.out.println("DADOS GRAVADOS:");
        System.out.println("Nome: \t" + nome);
        System.out.println("Sexo: \t" + sexo);
        System.out.println("Renda: \t" + nf.format(renda));
        System.out.println();
        System.out.println();

    }
}
