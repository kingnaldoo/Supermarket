import java.util.UUID;

public class Venda {
    private static UUID uuid = UUID.randomUUID();
    private String produto;
    private boolean pago;
    
    public Venda(String produto, float preco, Cliente cliente, Funcionario funcionario)  {
        Estoque estoque = new Estoque();

        if (funcionario.isPresente()) {
            setProduto(produto);
            
            if(cliente.getCarteira() == preco) {
                cliente.setCarteira(0);
                funcionario.setDinheiroRecebido(preco);
                estoque.reduzirEstoque(produto, 1, funcionario.getNome());
                setPago(true);

                System.out.println("Compra efetuada com sucesso.");
            } else if(cliente.getCarteira() > preco) {
                float troco = cliente.getCarteira()-preco;

                cliente.setCarteira(troco);
                estoque.reduzirEstoque(produto, 1, funcionario.getNome());
                setPago(true);
                
                System.out.println("Compra efetuada com sucesso. Seu troco é R$"+ troco);
            } else {
                System.out.println("Compra não efetuada. Saldo insuficiente.");
            }
        } else {
            System.out.println("Não foi possível efetuar a compra. Funcionário ausente");
        }
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public static UUID getUuid() {
        return uuid;
    }
}
