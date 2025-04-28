package br.fastfood.app;
import br.fastfood.facade.ComboFacade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Master");
        System.out.println("2 – Super Combo");
        System.out.println("3 – Combo Vegano");
        System.out.print("Sua escolha: ");

        int escolha = in.nextInt();

        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);

        if (escolha >= 1 && escolha <= 3) {
            facade.exibirItens();
            System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());
        }

        in.close();
    }
}