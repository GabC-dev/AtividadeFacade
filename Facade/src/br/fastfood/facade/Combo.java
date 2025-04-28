package br.fastfood.facade;

public class Combo {
    private final Burguer burger;
    private final Bebida bebida;
    private final Sobremesa sobremesa;

    public Combo(Burguer burger, Bebida bebida, Sobremesa sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public Burguer getBurger() {
        return burger;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }

    public void exibirItens() {
        System.out.println("Burger: " + burger.getNome() + " - R$ " + burger.getPreco());
        System.out.println("Bebida: " + bebida.getNome() + " - R$ " + bebida.getPreco());
        System.out.println("Sobremesa: " + sobremesa.getNome() + " - R$ " + sobremesa.getPreco());
    }
}
