package br.fastfood.facade;

public class ComboFacade {

    private Combo comboAtual;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                comboAtual = new Combo(
                        new Burguer("X-salada", 15.00),
                        new Bebida("Refrigerante", 7.00),
                        new Sobremesa("Sorvete de chocolate", 5.00)
                );
                break;
            case 2:
                comboAtual = new Combo(
                        new Burguer("X-frango", 18.00),
                        new Bebida("Suco natural", 8.00),
                        new Sobremesa("Torta de maçã", 6.00)
                );
                break;
            case 3:
                comboAtual = new Combo(
                        new Burguer("X-salada vegano", 17.00),
                        new Bebida("Água", 5.00),
                        new Sobremesa("Torta de banana", 7.00)
                );
                break;
            default:
                System.out.println("Combo inválido.");
                comboAtual = null;
                break;
        }
    }

    public void exibirItens() {
        if (comboAtual != null) {
            comboAtual.exibirItens();
        } else {
            System.out.println("Nenhum combo foi selecionado.");
        }
    }

    public double getPrecoTotal() {
        if (comboAtual != null) {
            return comboAtual.getBurger().getPreco() +
                    comboAtual.getBebida().getPreco() +
                    comboAtual.getSobremesa().getPreco();
        }
        return 0;
    }
}
