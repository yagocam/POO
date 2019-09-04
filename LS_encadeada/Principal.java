import java.util.Scanner;

public class Principal
{
    public static char menu()
    {
        String msg ;
        System.out.println("----------------------------------");
        System.out.println("=      Escolha uma opção    =");
        System.out.println("------------------------------------");
        System.out.println("=    1. Inserir no Inicio        =");
        System.out.println("=    2. Inserir no Final         =");
        System.out.println("=    3. Localizar Pessoa         =");
        System.out.println("=    4. Excluir Pessoa           =");
        System.out.println("=    5. Imprimir Lista           =");
        System.out.println("=    6. Quantidade de pessoas    =");
        System.out.println("=    7. Sair do Programa         =");
        System.out.println("------------------------------------");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }//-------MENU
    public static void main(String[] args) {
        Scanner dado = new Scanner (System.in);
        Lista lista = new Lista();
        Pessoa p ;
        char opcao ;

        do
            {
                opcao = menu();
                switch (opcao)
                {
                    case '1' :
                        System.out.println("------------- Inserindo no inicio -------------");
                        p = new Pessoa ();
                        System.out.print("Nome: ");
                        p.setNome(dado.next());
                        System.out.print("Sexo: ");
                        p.setSexo(dado.next());
                        System.out.print("Idade:");
                        p.setIdade(dado.nextInt());
                        lista.inserirPrimeiro(p);
                        break;

                    case '2' :
                        System.out.println("------------- Inserindo no final -------------");
                        p = new Pessoa ();
                        System.out.print("Nome: ");
                        p.setNome(dado.next());
                        System.out.print("Sexo: ");
                        p.setSexo(dado.next());
                        System.out.print("Idade:");
                        p.setIdade(dado.nextInt());
                        lista.inserirUltimo(p);
                        break;
                    case '3' :
                        if(lista.checaVazio())
                        {
                            System.out.println("Lista vazia !");
                        } else
                            {
                                System.out.print("Localizando pessoa\nDigite o nome: ");
                                String nome = dado.next();
                                if(lista.pesquisarNo(nome)==null)
                                {
                                    System.out.println("Pessoa não cadastrada !");
                                } else
                                    {
                                        System.out.println("::::: ENCONTRADO :::::");
                                        System.out.println(lista.pesquisarNo(nome));
                                        System.out.println("::::::::::::::::::::::");
                                    }
                            }
                        break;
                    case '4' :
                        if(lista.checaVazio())
                        {
                            System.out.println("Lista vazia !");
                        } else
                            {
                                System.out.print("Excluir uma pessoa\nDigite o nome: ");
                                String nome = dado.next();
                                if (lista.removerNo(nome))
                                {
                                    System.out.println(nome+" foi removido com sucesso !");
                                } else
                                    {
                                        System.out.println("Não foi possivel remover " + nome);
                                    }
                            }
                        break;
                    case '5' :
                        System.out.println("--------------------------------------------------");
                        System.out.println("Lista: " + lista.imprimirLista());
                        System.out.println("--------------------------------------------------");
                        break;
                    case '6' :
                        System.out.println("A lista contém " + lista.getCont() + " pessoas.");
                        break;
                    case '7' :
                        System.out.println("Fim do programa !");
                        break;
                    default :
                        System.out.println("Opção inválida !");
                }
            } while(opcao != '7');
            System.exit(0);
    }
}
