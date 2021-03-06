/*
 * Crie um novo aplicativo, chamado Exercicio1, que capte o nome de cinco animais através de argumentos na própria
 * janela de comando e que liste todos os dados informados do modo como está representado na Figura 3.13.
 */

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Meus animais preferidos:");
        System.out.println("1. "+ args[0]);
        System.out.println("2. "+ args[1]);
        System.out.println("3. "+ args[2]);
        System.out.println("4. "+ args[3]);
        System.out.println("5. "+ args[4]);
    }
}
