package visão;


import visão.Pessoa;

public class Usuario extends Pessoa
{
    private String senha;
    public Usuario(){};
    public Usuario(String nome, int idade, String senha)
    {
        setNomePessoa(nome);
        setIdade(idade);
        this.senha = senha;
    }
    public Usuario (String nome,String senha)
    {
        setNomePessoa(nome);
        this.senha = senha;
    }
    public boolean verificar(String senha)
    {
        if(this.senha==senha)
        {
            System.out.println("Senha correta!");
            return  true;
        } else
            {
                System.out.println("Senha incorreta, tente novamente");
                System.exit(0);
                return false;

            }
    }
}
