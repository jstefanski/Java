package Variaveis_e_Constantes_04.Exercicios;

/*
 * Crie um novo aplicativo, chamado Exercicio2, que solicite trÊs dados ao seu usuário: seu nome completo, seu sexo e sua
 * renda familiar. Todos estes dados devem ser captados através de diálogos gráficos e, para isso, você deve utilizar a
 * classe javax.swing.JOptionPane. O nome deve ser armazenado em um objeto do tipo String, o sexo deve ser armazenado em uma
 * váriavel do tipo char e a renda familiar deve ser armazenada em uma variável do tipo double. Ao final, o aplicativo deve
 * exibir uma mensagem através de um diálogo gráfico. Esta mensagem deve apresentar os três dados informados no mesmo formato
 * em que se apresentam na Figura 4.10.
 */

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio02 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        String nome, sexo_string, renda_string;
        char sexo;
        double renda;

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        nome = JOptionPane.showInputDialog(null,"Informe seu Nome Completo: ");

        sexo_string = JOptionPane.showInputDialog(null,"Informe seu Sexo (M ou F): ");
        sexo = sexo_string.charAt(0);

        renda_string = JOptionPane.showInputDialog(null,"Informe sua Renda Familiar: ");
        renda = Double.parseDouble(renda_string);

        JOptionPane.showMessageDialog(null,"DADOS GRAVADOS: \n" +
                "\n" + "Nome: " + nome +
                "\n" + "Sexo: " + sexo +
                "\n" + "Renda: " + nf.format(renda));

        System.exit(0);
    }
}
