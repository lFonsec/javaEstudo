package entities;

public class Estoque2 {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Estoque2(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double precoTotalNoEstoque(){
        return preco * quantidadeEstoque;
    }

    public void adcionarEstoque(int quantidade){
        this.quantidadeEstoque = this.quantidadeEstoque + quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidadeEstoque = this.quantidadeEstoque - quantidade;
    }

    public String toString(){
        return nome + ", " + preco + ", " + quantidadeEstoque + " unidades, total: " + precoTotalNoEstoque();
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
