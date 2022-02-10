import java.util.UUID;

public class Produto {
    private static UUID uuid = UUID.randomUUID();
    private String nome;
    private int quantidadeDisponivel;
    private float preco;
    
    public Produto(String nome, int quantidadeDisponivel, float preco) {
        this.nome = nome;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public static UUID getUuid() {
        return uuid;
    }
}
