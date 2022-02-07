public class Funcionario implements IPessoa {
    private String nome;
    private String cpf;
    private String localDeTrabalho;

    public Funcionario(String nome, String cpf, String localDeTrabalho) {
        this.nome = nome;
        this.cpf = cpf;
        this.localDeTrabalho = localDeTrabalho;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }



    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }



    public boolean baterPonto() {
        return true;
    }
}
