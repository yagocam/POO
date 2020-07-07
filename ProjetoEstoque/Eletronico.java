package visão;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import visão.Produto;

public class Eletronico extends Produto implements Garantia
{
    public  Eletronico(){};
    public Eletronico(String nome, double preco,String t)
    {
        setNome(nome);
        setPreco(preco);
        setTipo(t);
    }
    @Override
    public void exibir()
    {
        System.out.println("O eletrônico  "+getNome()+" custa: "+getPreco());
        garantia();
    }

    @Override
    public void garantia()
    {
        System.out.println("Esse produto possui garantia de um ano!");
    }
      @Override
    public String salvar() {
     try {
         FileWriter fw = new FileWriter("produtos.txt",true);
         PrintWriter pw = new PrintWriter(fw);
         pw.println("Nome : "+this.getNome());
         pw.println("Quantidade : "+this.getQuantidade());
         pw.println("Preço :"+this.getPreco());
         pw.println("Tipo :"+this.getTipo());
         pw.flush();
         pw.close();
         fw.close();
     } catch (IOException ex) {
         Logger.getLogger(Comida.class.getName()).log(Level.SEVERE, null, ex);
     }
     return null;
     } 
}
