public interface IEstoque {
    public void aumentarEstoque(String nome, int quantidade, String estabelecimento);
    
    public void reduzirEstoque(String nome, int quantidade, String funcionario);
}
