public class Estoque implements IEstoque {
    Produto[] produto = {
        new Produto("Danone", 3, 10),
        new Produto("Pneu", 10, 200)
    };

    public void aumentarEstoque(String nome, int quantidade, String estabelecimento) {
        for (int i = 0; i < produto.length; i++) {
            if(produto[i].getNome() == nome) {
                produto[i].setQuantidadeDisponivel(produto[i].getQuantidadeDisponivel()+quantidade);
                System.out.println("O estoque de "+nome+" foi aumentado em "+quantidade+" unidades pelo fornecedor "+estabelecimento);
            }
        }
    }
    
    public void reduzirEstoque(String nome, int quantidade, String funcionario) {
        for (int i = 0; i < produto.length; i++) {
            if (produto[i].getNome() == nome) {
                produto[i].setQuantidadeDisponivel(produto[i].getQuantidadeDisponivel() - quantidade);
                System.out.println("O estoque de " + nome + " foi reduzido em " + quantidade + " unidades pelo funcionario "+funcionario);
            }
        }
    }
}
