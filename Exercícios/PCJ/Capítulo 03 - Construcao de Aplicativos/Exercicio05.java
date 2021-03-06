/*
 * Crie um novo aplicativo chamado Exercicio5, que solicite o nome dos dois jogos prediletos de seu usuário e que, ao final,
 * apresente estes dois dados através de uma única mensagem gráfica. Este aplicativo também deve captar os dois dados através
 * de diálogos gráficos, como se encontra ilustrado na Figura 3.16.
 */

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        String Primeiro_Jogo = JOptionPane.showInputDialog(null,"Informe seu 1º Jogo Preferido!");
        String Segundo_Jogo = JOptionPane.showInputDialog(null,"Informe seu 2º Jogo Preferido!");

        JOptionPane.showMessageDialog(null,"Seus Jogos preferidos: \n\n1. " + Primeiro_Jogo + "\n" + "2. " + Segundo_Jogo);
        System.exit(0);
    }
}
