package Variaveis_e_Constantes_04.Exercicios;

/*
 * Crie um novo aplicativo, chamado Exercicio4, que solicite um número inteiro e calcule o seu cubo. Tanto a captação do
 * número quanto a exibição do resultado devem ser feitas atra´´es de diálogos gráficos. A figura 4.12 ilustra os diálogos
 * que deverão ser produzidos por este aplicativo.
 */

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        String numero_string;
        int numero, cubo;

        numero_string = JOptionPane.showInputDialog(null,"Informe um Número Inteiro: ");
        numero = Integer.parseInt(numero_string);

        cubo = numero * numero * numero;

        JOptionPane.showMessageDialog(null,"O cubo de " + "número " + "é: " + cubo);
        System.exit(0);
    }
}
