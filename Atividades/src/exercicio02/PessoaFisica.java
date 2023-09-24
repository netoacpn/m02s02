package exercicio02;

public class PessoaFisica {
    private String cpf;
    private String nome;
    private String sobrenome;
    private String email;

    public PessoaFisica(String cpf){
        setCpf(cpf);
    }

    private boolean validaCpf(String cpf){
        return cpf.length() == 11;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validaCpf(cpf)) {
            this.cpf = cpf;
        } else{
            System.out.println("CPF inválido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
