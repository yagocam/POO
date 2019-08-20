import java.util.Scanner;

public class principal
{


    public static void main(String[] args)
    {
        float valor ;
        Scanner dado = new Scanner(System.in);
        ContaBancaria pessoa ;
        System.out.print("Entre o número da conta : ");
        int numero = dado.nextInt();

        System.out.print("Entre com o nome do titular :");
       String nome = dado.next();
        System.out.println("Haverá depósito inicial ?");
       String resposta = dado.next();


        if (resposta.equals("s"))
        {

            System.out.print("Entre o valor do depósito inicial : ");
           valor = dado.nextFloat();
            pessoa = new ContaBancaria(numero,nome,valor);

        }
        else
        {
            pessoa = new ContaBancaria (numero,nome);

        }

        System.out.println("Dados da conta : " );
        System.out.print("Conta : " + pessoa.getnumeroConta() + ","+"Titular : " + pessoa.nomeTitular + "," + "Saldo : " + pessoa.getSaldo());
        System.out.println();
        System.out.print("Entre um valor para depósito : ");
         valor = dado.nextFloat();
         pessoa.adicionarDeposito(valor);
        System.out.println("Dados da conta : " );
        System.out.print("Conta : " + pessoa.getnumeroConta() + ","+"Titular : " + pessoa.nomeTitular + "," + "Saldo : " + pessoa.getSaldo());
        System.out.println();
        System.out.print("Entre um valor para saque : ");
        valor = dado.nextFloat();
        pessoa.retirarSaque(valor);
        System.out.print("Dados atualizados :  ");
        System.out.print("Conta : " + pessoa.getnumeroConta() + ","+"Titular : " + pessoa.nomeTitular + "," + "Saldo : " + pessoa.getSaldo());
    }
}

    class ContaBancaria
    {
        private int _numeroConta;
        public String nomeTitular;
        private float _saldo;

        public ContaBancaria(int numero , String nome , float saldo)
        {
           _numeroConta=numero;
            nomeTitular=nome;
            adicionarDeposito(saldo);

        }
        public ContaBancaria (int numero,String nome)
        {
            _numeroConta=numero;
            nomeTitular=nome;
        }

        public void adicionarDeposito(float valor) {
            _saldo += valor;
        }

        public void retirarSaque(float saque) {
            _saldo = _saldo - saque - 5;
        }

        public void adicionarNumero(int numero) {
            _numeroConta = numero;
        }

        public int getnumeroConta() {
            return _numeroConta;
        }

        public float getSaldo() {
            return _saldo;
        }
    }
