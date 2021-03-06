/*
 * Crie um novo aplicativo, chamado Exercicio7, que solicite um único caractere e informe qual é o caractere seguinte na
 * tabela Unicode. A figura 4.15 ilustra qual deverá ser o resultado quando for inforamda a letra C.
 */

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        String caractere_string;
        char caractere_atual, caractere_proximo;
        int codigo, prox_codigo;

        caractere_string = JOptionPane.showInputDialog(null, "Informe um caractere: ");
        caractere_atual = caractere_string.charAt(0);

        // Obter Código e Próximo Código(+1) do Caracter
        codigo = (int) caractere_atual + 1;

        // Obter o Caracter Correspondente ao Próximo Código
        caractere_proximo = (char) codigo;

        JOptionPane.showMessageDialog(null, "Caractere Informado: " + caractere_proximo);
        System.exit(0);
    }
}
