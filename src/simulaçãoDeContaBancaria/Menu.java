package simulaçãoDeContaBancaria;
import java.util.Scanner;


/*
 * 
 * Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
    Consultar saldo 
    consultar cheque especial
    Depositar dinheiro;
    Sacar dinheiro;
    Pagar um boleto.
    Verificar se a conta está usando cheque especial.
    Siga as seguintes regras para implementar

    A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
    O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
    Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
    Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
    Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

 * 
 */

public class Menu {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int opcao ;
        
    //criando a conta e o boleto(instanciando um novo objeto)
    Conta conta001 = new Conta("josue", 250);
    boleto agua = new boleto("11225421315421356845623185", "sabesp", "josue", 80);
    boleto luz = new boleto("12345612123545461213155", "Enel", "josue", 270.99);
    //mensagem inicial
    System.out.println("\n\nSeja bem vindo " + conta001.getterName());
    System.out.println("Qual operação deseja Realizar hoje: \n");
    
    while (true) {
    
    

        //menu de operações
        System.out.println("1.Consultar seu saldo \n2.Consultar cheque especial");
        System.out.println("3.Depositar dinheiro \n4.Sacar dinheiro");
        System.out.println("5.Pagar boleto ");
        System.out.println("digite 6 para sair\n");

        opcao = leitor.nextInt();


        switch (opcao) {
            case 1:
                conta001.consultarSaldo();
            break;

            case 2:
                conta001.consultarChequeEspecial();
            break;

            case 3:
                System.out.println("\nQual o valor do seu deposito:\n");
                double deposito = leitor.nextDouble();
                conta001.depositarDinheiro(deposito);
            break;
        
            case 4:
                 System.out.println("Quanto você deseja sacar?");
                 double saque = leitor.nextDouble();
                conta001.sacarDinherio(saque);
            break;

            case 5:
               System.out.println("Qual boleto voce deseja pagar ?");
                System.out.println("1 conta de Agua \n2 conta de luz ");
                int conta = leitor.nextInt();
                int confirmaçãoPagamento;
                if (conta == 1) {
                    agua.exibirDadosDoBoleto();
                    System.out.println("Digite 1 para confirmar o pagamento");
                    confirmaçãoPagamento = leitor.nextInt();
                    if (confirmaçãoPagamento == 1) {
                        conta001.pagarBoleto(agua.pegarValor());
                    }else{
                        System.out.println("Operação cancelada pelo Usuario");
                    }
                    
                }else{
                    luz.exibirDadosDoBoleto();
                    confirmaçãoPagamento = leitor.nextInt();
                    if (confirmaçãoPagamento == 1) {
                        conta001.pagarBoleto(luz.pegarValor());
                    }else{
                        System.out.println("Operação cancelada pelo Usuario");
                    }
                }
            break;

            case 6:
                System.out.println("obrigado por usar nossos serviços") ;

            break;
            
            default:
            System.out.println("essa opção e invalida");
            break;
    }


    if (opcao == 6) {
        
        break;
    }
    
}

leitor.close();
    
}

    
    
    
}
