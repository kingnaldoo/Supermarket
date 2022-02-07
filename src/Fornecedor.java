public class Fornecedor {
    private static int id = 0;
    private String estabelecimento;
    
    public Fornecedor(String estabelecimento) {
        this.estabelecimento = estabelecimento;
        incrementId();
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
    
    public static int incrementId() {
        return id++;
    }
}
