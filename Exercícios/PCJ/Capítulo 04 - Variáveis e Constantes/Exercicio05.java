/*
 * Crie um novo aplicativo, chamado Exercicio5, que solicite três dados: o nome de um vendedor, o valor de vendas realizadas
 * por ele em um determinado mês e percentual de comissão a que ele tem direito. Todos estes dados devem ser captados na
 * própria janela de comando. O nome deve ser armazenado em um objeto do tipo String e os outros dois dados devem ser armazenados
 * em variáveis do tipo double. A tarefa do aplicativo é calcular e exibir o valor que deve ser pago a este vendedor à título
 * de comissão. A Figura 4.13 ilustra as saídas que devem ser produzidas por este aplicativo.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercicio05 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        String nome, valor_venda_string, perc_comissao_string;
        double valor_venda, perc_comissao, comissao;

        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("Informe o nome do vendedor: ");
        nome = scan.nextLine();

        System.out.print("Informe o total de vendas realizadas por " + nome + ": ");
        valor_venda_string = scan.nextLine();
        valor_venda = Double.parseDouble(valor_venda_string);

        System.out.print("Informe o percentual de comissão de " + nome + ": ");
        perc_comissao_string = scan.nextLine();
        perc_comissao = Double.parseDouble(perc_comissao_string);

        comissao = valor_venda * perc_comissao / 100;

        System.out.println("\nValor da Comissão de " + nome + ": " + nf.format(comissao));
    }
}
