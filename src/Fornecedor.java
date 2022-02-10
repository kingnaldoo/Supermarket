import java.util.UUID;

public class Fornecedor {
    private static UUID uuid = UUID.randomUUID();
    private String estabelecimento;
    
    public Fornecedor(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
    
    public String getEstabelecimento() {
        return this.estabelecimento;
    }

    public static UUID getUuid() {
        return uuid;
    }    
}
