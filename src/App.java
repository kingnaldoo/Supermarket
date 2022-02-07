public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Reinaldo", "079.337.003-57", "Rua Antônio Belarmino, 72");
        Funcionario funcionario1 = new Funcionario("Augusto", "678.435.911-98", "Mercado São Sebastião");

        cliente1.fazerPedido("Papel higiênico");
        
    }
}
