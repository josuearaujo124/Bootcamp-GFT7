import java.util.Scanner;

public class ExEstruturasDeControle {

    /* 1. Escreva um codigo onde o usuario entra com um numero e seja gerada a tuabuada de 1 até 10 desse numero;
       2. Escreva um codigo onde o usuario entra com sua altura e peso,seja feito o calculo do imc
       (imc = peso/(altura * altura )) e seja exibida a mensagem de acordo com o resultado

       se for menor ou igual a 18,5 "abaixo do peso"
       se for entre 18,6 e 24,9 "peso ideal";
       se for entre 25,0 e 29,9 "levemente acima do peso";
       se for entre 30,0 e 34,9 "obesidade grau 1";
       se for entre 35,0 e 39,9 "obesidade grau 2 ";
       se for maior que 40,0 "obesidade 3(morbida)";
       
       3.Escreva um codigo que o usuario entre com um primeiro numero,um segundo numero maior que o primeiro e 
       escolhe entre a opção par e impar,com isso o codigo deve informar todos os numeros  pares ou impares
       (de acordo com a seleção ideal ) no intervalo de numeros informados, incluindo os numeros informados e
       em ordem decrecente;

       4.Escreva um codigo onde o usuario informa um numero inicial, posteriomente ira informar outros n numeros,
       a execução do codigo ira continuar ate que o numero informado divido pelo primeiro numero tenha resto diferente
       de 0 na divisao,numeros menores que o primeiro numero devem ser ignorados.
     * 
     */
    
     static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int opção;

        System.out.println("Seja bem-vindo qual das soluções voce deseja usar?");
        System.out.print(" 1.calculo de tabuada \n 2.calcule o seu imc\n");
        System.out.print(" 3.calcule a quant de pares ou impares em um intervalo \n 4.tente encerrar a divisão requisito (resto da divisão = 0)\n ");
        opção = s.nextInt();
        

        switch (opção) {
            case 1 -> calculoTabuada();
            case 2 -> CalculoIMC();
            
        
            default -> System.out.println("essa opção não e valida");
               
        }

        
    }

    public static boolean calculoTabuada(){
       
        int opção = 0;

        System.out.println("você deseja um numero especifico ou um intervalo para a tabuada");
        System.out.print(" Digite 1 para numero especifico \n digite 2 para um intevalo \n");
        opção = s.nextInt();

        if (opção == 1) {
        
        int numero;
        int contador = 1;
        
        System.out.println("Digite um numero");
        numero = s.nextInt();
        System.out.println();
        while (contador <= 10) {
            System.out.print(numero * contador +" ");
            contador ++;
        }
        
        
        }else if (opção == 2) {
            int numeroInicial;
            int numeroFinal;
            int contador = 1;
            int valor;
        
            System.out.println("Digite por qual numero deseja iniciar");
            numeroInicial = s.nextInt();

            System.out.println("Agora digite o numero que deseja terminar");
            numeroFinal = s.nextInt();
            System.out.println();

            while (numeroInicial <= numeroFinal) {
                valor = numeroInicial;
                System.out.println("tabuada do "+ valor);
                while ( contador <= 10 ) {
                    System.out.print(valor *contador +" ");   
                    contador ++;                 
                }
                contador = 1;
                numeroInicial ++;
                System.out.println();
            }
        }else{
            System.out.println("Essa opção não e valida");
        }
        
        return true;
        }

    public static boolean CalculoIMC(){
        double peso,altura,imc;
        String resultado = "" ;

        System.out.println(" vamos calcular seu Imc \n primeiro digite seu peso");
        peso = s.nextDouble();
        System.out.println("Agora digite sua altura");
        altura = s.nextDouble();

        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            resultado = "e voce esta abaixo do peso";
        }else if (imc >= 18.6 && imc <= 24.9) {
            resultado ="Parabens seu peso esta no ideal";
        }else if (imc >= 25.0 && imc <= 29.9) {
            resultado = "Voce esta levemente acima do peso";
        }else if (imc >= 30.0 && imc <= 34.9) {
            resultado = "Voce esta com obesidade grau 1";
        }else if (imc >= 35.0 && imc <= 39.9) {
            resultado = "Voce esta com obesidade grau 2 tome cuidado!!!";
        }else if (imc >= 40) {
            resultado = "Voce esta com obesidade grau 3 (morbida) Procure um medico";
        }
        
        System.out.printf("seu imc é %.2f  %s",imc,resultado);
        return true;
    }  


}
