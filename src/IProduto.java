public interface IProduto extends IProdutoPerecivel, IProdutoNaoPerecivel{
    public String getdescricao();
    public void setDescricao(String descricao);
    public float preco();
    public void setPreco(float preco);

}
