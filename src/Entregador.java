public class Entregador extends Funcionario{
    private String placaDoVeiculo;

    public Entregador(String nome, String cpf, String localDeTrabalho, String placaDoVeiculo) {
        super(nome, cpf, localDeTrabalho);
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public void setPlacaDoVeiculo(String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public String entregarProduto() {
        return "Produto entregue";
    }
}
