package exercicio04;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;
    public Fatura(String numero, String descricao, int quantidade, double preco){
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = Math.max(quantidade, 0);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = Math.max(preco, 0);
    }

    public double getValorFatura(){
        return this.quantidade * this.preco;
    }
}
