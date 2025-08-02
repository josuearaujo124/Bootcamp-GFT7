import java.util.Scanner;

public class ExEstruturasDeCintrole {

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
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Seja bem-vindo qual das soluções voce deseja usar?");
        System.out.print(" 1.tabuada de um numero especifico \n 2.calcule o seu imc\n");
        System.out.print(" 3.calcule a quant de pares ou impares em um intervalo \n 4.tente encerrar a divisão requisito (resto da divisão = 0)\n ");

        
    }
}
