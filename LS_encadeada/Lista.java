public class Lista
{
    private No prim;
    private No ult;
    private int cont;
    public Lista ()
    {
       this.prim = null;
       this.ult = null;
       this.cont = 0;
    }//-------------Construtor

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
       this.cont = cont;
    }//---------------

    public boolean checaVazio ()
    {
        return (prim==null);

    }//-------------- checaVazio


    public void inserirPrimeiro(Pessoa p )
    {
        No novo = new No(p);
        if(checaVazio())
        {
            ult = novo;
        }
        novo.setProx(prim);
        prim = novo ;
        cont ++;
    }//-----------Inserir Primeiro

    public void inserirUltimo(Pessoa p)
    {
     No novo = new No(p);
     if(checaVazio())
     {
         prim=novo;
     } else {
         ult.setProx(novo);
     }
        ult = novo;
        cont++;
    }//----------inserirUltimo
    public boolean removerNo(String nome )
    {
        No atual = prim;
        No ant = null;
        if(checaVazio())
        {
            return false;
        }else
            {
                while ((atual!=null) && (!atual.getP().getNome().equals(nome)))
                {
                    ant   =   atual;
                    atual = atual.getProx();
                }
                if(atual == prim)
                {
                    if(prim==ult)
                    {
                      ult = null;
                    }
                    prim = prim.getProx();
                } else
                    {
                        if(atual==ult)
                        {
                            ult=ant;
                        }
                            ant.setProx(atual.getProx());
                    }

                        cont--;
                        return true;
            }
    }//-----------removerNo
            public String pesquisarNo(String nome) {
                String msg = "";
                No atual = prim;
                while ((atual != null) && (!atual.getP().getNome().equals(nome))) {
                    atual = atual.getProx();
                }
                return msg = "Nome : " + atual.getP().getNome() + "\n" +
                        "Sexo : " + atual.getP().getSexo() + "\n" +
                        "Idade : " + atual.getP().getIdade();

            }//---------pesquisarNo

            public String imprimirLista()
            {
                String msg = "";
                if (checaVazio())
                {
                    msg = "A lista está vazia !";
                } else
                    {
                        No atual = prim;
                        while (atual != null)
                        {
                            msg += atual.getP().getNome() + "-->";
                            atual = atual.getProx();
                        }
                    }
                return msg;
            }//--------------imprimirLista
}

