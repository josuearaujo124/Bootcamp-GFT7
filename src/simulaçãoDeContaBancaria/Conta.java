package simulaçãoDeContaBancaria;
import java.util.Scanner;


public class Conta {
    Scanner leitor = new Scanner(System.in);
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

    public double getterSaldo(){
        return saldo;
    }

    public void consultarSaldo(){
        System.out.printf("Voce possui R$ %.2f de saldo e %.2f de cheque especial \n",saldo,chequeEspecialAtual);
        trava();
    }

    public void consultarChequeEspecial(){
        System.out.printf("Voce possui R$ %.2f de cheque especial",chequeEspecialAtual);
        trava();
    }

    public void depositarDinheiro(double deposito){
        if (chequeEspecialAtual == tetochequeEspecial) {
         saldo += deposito;   
         System.out.printf("Seu saldo agora é %.2f",saldo);
         trava();
        }else{
            double divida = tetochequeEspecial - chequeEspecialAtual;
            double dividaCom20PorCento = divida + (divida * 0.2);
            if (deposito < divida) {
                deposito -= deposito *0.2;
                chequeEspecialAtual += deposito;
                consultarSaldo();
                trava();
            }else{
                chequeEspecialAtual = tetochequeEspecial;
                deposito -= dividaCom20PorCento;
                saldo += deposito;
                consultarSaldo();
                trava();
            }
        }
    }

    public void sacarDinherio(double sacar){

        if (sacar < saldo) {
            saldo -= sacar;
            System.out.printf("\nVocê sacou R$%.2f e sobrou o saldo de R$%.2f",sacar,saldo);
            System.out.println("\n\nDigite 1 para continuar\n\n");
            trava();

            }else{
                System.out.println("\nVoce nao possui saldo suficiente, Deseja usar cheque especial?\n Digite 1 para sim \n Digite 2 para não\n");
                int opcao = leitor.nextInt();

                if (opcao == 1 && sacar < saldo + chequeEspecialAtual) {

                    double saqueChequeEspecial = sacar - saldo;
                    saldo = 0;
                    chequeEspecialAtual -= saqueChequeEspecial;

                    System.out.printf("\nVocê sacou R$%.2f e sobrou o saldo de R$%.2f e o cheque especial de R$%.2f",sacar,saldo,chequeEspecialAtual);
                    trava();
                }else{
                    System.out.println("\nvocê nao possui saldo nem cheque especial o sufuciente tente novamente!");
                    trava();
                }
                
               
            }


    }

    public boolean pagarBoleto(double valor){
        if (valor < saldo) {
            System.out.println("Boleto pago com Sucesso");
            saldo -= valor;
            trava();
        return true;
        }else{
            System.out.println("Você não possui saldo suficiente");
            trava();
            return false;
        }

    }

    
    
    private void trava(){
        System.out.println("\n\nDigite 1 para continuar\n\n");
        int trava = leitor.nextInt();
        
        
        
    }

   
    


}
