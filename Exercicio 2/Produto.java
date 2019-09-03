public class Produto {
    private String descricao;
    private Tipo tipo ;
    private double preco;
    private double imposto;
    public Produto (String desc,double preco,Tipo tipo)
    {
    this.descricao = desc;
    this.preco = preco;
    this.tipo = tipo;

    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
        setImposto(preco*tipo.getPercentual() / 100);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double CalculaFinal()
    {
        return preco + imposto;
    }




}
