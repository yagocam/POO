package visão;

public abstract class Produto
{
    private String nome;
    private double preco;
    private int quantidade;
    private String tipo;

    public Produto(){}

    public Produto(String nome, double preco,int quant,String tipo)
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipo = tipo;

    }
    public abstract void exibir();

    public abstract String salvar();

    @Override
    public  String toString() {
        return
                "Produto '" + nome + '\'' +
                ", preco: " + preco +
                " ";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade ()
    {
        return quantidade;
    }
    public int setQuantidade(int quantidade)
    {
       return this.quantidade = quantidade;
    }

}
