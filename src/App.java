public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente1 = new Gerente("Bianca", "567.364.899-32", "Mercadinho São Sebastião");
        Funcionario funcionario1 = new Funcionario("Reginaldo", "456.222.645-78", "Mercadinho São Sebastião");
        gerente1.baterPonto();
        funcionario1.baterPonto();

        Cliente cliente1 = new Cliente("Joaquim", "056.888.423-78", "Rua César Augusto, 72", 200);
        new Venda("Papel", 10, cliente1, funcionario1);
        new Venda("Lápis", 20, cliente1, funcionario1);

        Fornecedor fornecedor1 = new Fornecedor("Cézar Atacado");
        gerente1.contactarFornecedor("Danone", 10, fornecedor1);
        
    }
}
