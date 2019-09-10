import java.util.*;
public class Principal {
    public static char menu()
    {
        String msg ;
        System.out.println("Escolha os comandos !");
        System.out.println("1 - Ligar a TV");
        System.out.println("2 - Inserir o canal ");
        System.out.println("3 - Selecionar próximo canal ");
        System.out.println("4 - Selecionar o canal anterior ");
        System.out.println("5 - Aumentar o volume");
        System.out.println("6 - Diminuir o volume");
        System.out.println("7 - Status");
        System.out.println("8 - Desligar");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto cr = new ControleRemoto(tv);
        char opcao;
        Scanner dado = new Scanner(System.in);

        do {
            opcao = menu();
            switch (opcao)
            {
                case '1' :
                    System.out.println("TV ligada !");
                    cr.ligaTv();
                    break;
                case '2' :
                    System.out.println("Coloque o canal !");
                    int canal = dado.nextInt();
                    cr.setCanal(canal);
                    break;
                case '3' :
                    System.out.println("Canal aumentado");
                    cr.aumentaCanal();
                    break;
                case '4' :
                    System.out.println("Canal anterior ");
                    cr.diminuiCanal();
                    break;
                case '5' :
                    System.out.println("Volume aumentado");
                    cr.aumentaVolume();
                    break;
                case '6' :
                    System.out.println("Volume abaixado");
                    cr.diminuiVolume();
                    break;
                case '7' :
                    System.out.println("Canal :"+tv.getCanal() + " Volume :" + tv.getVolume());
                    break;
                case '8' :
                    System.out.println("TV desligada !");
                    cr.desligaTv();
                    break;
            }

        }while (opcao != '8');
        System.exit(0);


    }
}
