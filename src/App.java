public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente1 = new Gerente("Bianca", "567.364.899-32", "Mercadinho São Sebastião");
        Funcionario funcionario1 = new Funcionario("Reginaldo", "456.222.645-78", "Mercadinho São Sebastião");
        Entregador entregador1 = new Entregador("Bianca", "633.897.400-56", "Mercadinho São Sebastião", "UOL-5689");
        gerente1.baterPonto();
        funcionario1.baterPonto();
        entregador1.baterPonto();

        Cliente cliente1 = new Cliente("Reinaldo", "079.337.003-57", "Rua Antônio Belarmino, 72", 200);
        new Venda("Papel", 10, cliente1, funcionario1);

        
    }
}
