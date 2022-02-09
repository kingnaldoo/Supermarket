public class Venda {
    private static int id;
    private String produto;
    private boolean pago;
    
    public Venda(String produto, float preco, Cliente cliente, Funcionario funcionario)  {
        setProduto(produto);
        if(cliente.getCarteira() == preco) {
            incrementId();
            cliente.setCarteira(0);
            if(funcionario.isPresente()) {
                funcionario.setDinheiroRecebido(preco);
            }
            setPago(true);
            System.out.println("Compra efetuada com sucesso.");
        } else if(cliente.getCarteira() > preco) {
            float troco = cliente.getCarteira()-preco;
            cliente.setCarteira(troco);
            System.out.println("Compra efetuada com sucesso. Seu troco é R$"+ troco);
        } else {
            System.out.println("Compra não efetuada. Saldo insuficiente.");
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

    public static int incrementId() {
        return id++;
    }
}
