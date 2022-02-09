public class Cliente implements IPessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private float carteira;

    public Cliente(String nome, String cpf, String endereco, float carteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.carteira = carteira;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getCarteira() {
        return carteira;
    }

    public void setCarteira(float carteira) {
        this.carteira = carteira;
    }

    
}
