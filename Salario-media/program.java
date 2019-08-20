import java.util.Scanner;

public class program
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner (System.in);
        Funcionario p1 = new Funcionario();
        Funcionario p2 = new Funcionario();
        System.out.println("Dados do primeiro funcionário : ");
        System.out.print("Insira o nome : ");
        p1.nome = dado.next();
        System.out.print("Insira o salário : ");
        p1.salario = dado.nextInt();
        System.out.println("Dados do segundo funcionário : ");
        System.out.print("Insira o nome : ");
        p2.nome = dado.next();
        System.out.print("Insira o salário : ");
        p2.salario = dado.nextInt();
        System.out.println("Salário médio : " + ((p1.salario + p2.salario)/2));
    }

}
class Funcionario
{
    public String nome ;
    public  int salario;

}
