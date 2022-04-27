package entities;

public class Estoque {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

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
}