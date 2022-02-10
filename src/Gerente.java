public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, String localDeTrabalho) {
        super(nome, cpf, localDeTrabalho);
    }

    public void contactarFornecedor(String produto, int quantidade, Fornecedor fornecedor) {
        Estoque estoque = new Estoque();

        estoque.aumentarEstoque(produto, quantidade, fornecedor.getEstabelecimento());
    }
}
