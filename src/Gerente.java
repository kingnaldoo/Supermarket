public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, String localDeTrabalho) {
        super(nome, cpf, localDeTrabalho);
    }

    public String contactarFornecedor() {
        return "Fornecedor contactado";
    }
}
