import javax.swing.JOptionPane;

public class Codigo11 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Informe seu Nome");
        JOptionPane.showMessageDialog(null,nome + ", Seja Bem-Vindo!!");
        System.exit(0);
    }
}
