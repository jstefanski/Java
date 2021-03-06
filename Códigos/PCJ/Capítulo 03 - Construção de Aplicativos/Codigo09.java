import java.io.IOException;

public class Codigo09 {
    public static void main(String[] args) throws IOException {
        System.out.print("\nInforme seu Nome: ");
        byte[] bt = new byte[50];
        System.in.read(bt);
        String nome = new String(bt).trim();
        System.out.printf("%s, Seja Bem-Vindo(a)\n\n", nome);
    }
}
