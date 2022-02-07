public class Fornecedor {
    private int id;
    private String estabelecimento;
    
    public Fornecedor(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
}
