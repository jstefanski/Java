/*
 * Crie um novo aplicativo chamado Exercicio4, que solicite o nome, nacionalidade e o telefone de seu usuário e que, ao
 * final, apresente estes três dados como se fosse uma confirmação de cadastro. As saídas produzidas por este aplicativo
 * devem ser idênticas àquelas apresentadas na Figura 3.16. Além disso, você deve implementar este aplicativo utilizando
 * a classe java.util.Scanner para captar as entradas de dados.
 *
 * A realização dessa tarefa implicará na importação da classe supracitada e na criação de um objeto que monitore os dados
 * que serão informados pelo usuário através da janela de comando. O método nextLine() deste objeto precisará ser executado
 * por três vezes no aplicativo, um para cada dado a ser captado.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu Nome: \t\t\t");
        String nome = scan.nextLine();

        System.out.print("Informe sua Nacionalidade: \t");
        String nacionalidade = scan.nextLine();

        System.out.print("Informe seu telefone: \t\t");
        String telefone = scan.nextLine();

        System.out.println();

        System.out.println("Cadastro Confirmado!");
        System.out.printf("Nome: \t\t\t %s \nNacionalidade: \t %s \nTelefone: \t\t %s \n", nome, nacionalidade, telefone);
    }
}

