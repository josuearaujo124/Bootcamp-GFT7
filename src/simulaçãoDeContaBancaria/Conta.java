package simulaçãoDeContaBancaria;
import java.util.Scanner;


public class Conta {
    
    private String name;
    private double saldo;
    private double tetochequeEspecial;
    private double chequeEspecialAtual;
    

    public Conta (String name ,double saldo){

        this.name = name;
        this.saldo = saldo;
        if (saldo <= 500) {
            tetochequeEspecial = 50;
        }else {
            tetochequeEspecial = saldo * 0.5;
        }
        chequeEspecialAtual = tetochequeEspecial;
    }

    /*
     * 
     * Consultar saldo 
    consultar cheque especial
    Depositar dinheiro;
    Sacar dinheiro;
    Pagar um boleto.
    Verificar se a conta está usando cheque especial.
   

     */

    public String getterName(){
        return name;
    }

    public void consultarSaldo(){
        System.out.printf("Voce possui R$ %.2f de saldo e %.2f de cheque especial \n",saldo,chequeEspecialAtual);
    }

    public void consultarChequeEspecial(){
        System.out.printf("Voce possui R$ %.2f de cheque especial",chequeEspecialAtual);
    }

    public void depositarDinheiro(double deposito){
        if (chequeEspecialAtual == tetochequeEspecial) {
         saldo += deposito;   
         System.out.printf("Seu saldo agora é %.2f",saldo);
        }else{
            double divida = tetochequeEspecial - chequeEspecialAtual;
            if (deposito < divida) {
                chequeEspecialAtual += deposito;
            }else{
                deposito -= divida;
                saldo += deposito;
                System.out.printf("Seu saldo agora é %.2f",saldo);
            }
        }
    }

    public void sacarDinherio(double sacar){

        if (sacar < saldo) {
            Scanner leitor = new Scanner(System.in);
            saldo -= sacar;
            System.out.printf("\nVocê sacou R$%.2f e sobrou o saldo de R$%.2f",sacar,saldo);
            System.out.println("\n\nDigite 1 para continuar\n\n");
            int trava = leitor.nextInt();
            }else{

               Scanner leitor = new Scanner(System.in);
                System.out.println("\nVoce nao possui saldo suficiente, Deseja usar cheque especial?\n Digite 1 para sim \n Digite 2 para não\n");
                int opcao = leitor.nextInt();

                if (opcao == 1 && sacar < saldo + chequeEspecialAtual) {

                    int saqueChequeEspecial = 

                    System.out.printf("znVocê sacou R$%.2f e sobrou o saldo de R$%.2f e o cheque especial de R$%.2f",sacar,saldo,chequeEspecialAtual);
                    System.out.println("\n\nDigite 1 para continuar\n\n");
                    int trava = leitor.nextInt();
                }else{
                    System.out.println("\nvocê nao possui saldo nem cheque especial o sufuciente tente novamente!");
                }
                
               
            }


    }


}
