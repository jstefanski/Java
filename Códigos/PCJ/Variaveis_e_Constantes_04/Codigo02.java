package Variaveis_e_Constantes_04.Codigos;

import javax.swing.JOptionPane;

public class Codigo02 {
    public static void main(String[] args) {
        float float_1, float_2;
        double double_1 = 5.123456789, double_2 = 10.0;

        float_1 = 1.02F;
        float_2 = 2.0F;

        String mensagem = "Conteúdo das Variáveis\n" +
                "\nfloat_1 = " + float_1 + "\nfloat_2 = " + float_2 +
                "\ndouble_1 = " + double_1 + "\ndouble_2 = " + double_2;

        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}
