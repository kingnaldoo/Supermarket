public class Venda {
    private static int id;
    private String produto;
    private boolean pago;
    
    public Venda(String produto) {
        this.produto = produto;
        incrementId();
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
