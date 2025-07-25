/* Execercios dos fundamentos java
 * 
 * 1.Escreva um codigo que receba o nome e o ano de alguem e imprima a seguinte mesangem "Olá 'fulano' voce tem 'X' anos "
 * 
 * 2. Escreva um codigo que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
 * (formula: area = Lado X lado)
 * 
 * 3.Escreva um codigo que receba a base e a altura de um retangulo e calcule suarea e exiba na tela 
 * (formula: area = base X altura)
 * 
 * 4.Escreva um codigo que receba o nome e a idade de 2 pessoas e imprima a diferença entre elas.
*/

import java.util.Scanner;

public class Fundamentos {

     static Scanner s = new Scanner(System.in);
     static String texto;
    public static void main(String[] args) throws Exception {
        int opção;
        System.out.println("Seja bem vindo aos fundamentos");
        System.out.println("Qual das operações a seguir voce quer realizar");
        System.out.println("Retorno do seu nome e idade (Digite 1)");
        System.out.println("calcular a area de um quadrado (Digite 2)");
        System.out.println("Calcular a area de um triangulo (Digite 3)");
        System.out.println("comparar sua idade com a de um amigo (Digite 4)");

        opção = s.nextInt();

        switch (opção) {
            case 1:
                retonoDoNomeEIdade();
                System.out.println(texto);
                break;
            case 2:
                areaDoQuadrado();
                System.out.println(texto);
                break;

            case 3:
                areaDoRetangulo();
                System.out.println(texto);
                break;

            case 4:
                diferençaDeIdade();
                System.out.println(texto);
                break;
            default:
                System.out.println("essa opção não e valida");
                break;
        }

        
    }

    public static String retonoDoNomeEIdade() {
        
        String nome; int idade;

        System.out.println("Digite seu nome:");
        nome = s.next();
        System.out.println("Digite sua idade:");
        idade = s.nextInt();

        texto = "Olá, "+nome + " vocé tem " + idade + " anos";
        return texto;

        
    }

    public static String areaDoQuadrado() {
        Double lado1,lado2,resultado;

        System.out.println("Digite o tamanho do primeiro lado do quadrado");
        lado1 = s .nextDouble();
        System.out.println("Digite o tamnaho do segundo lado do quadrado");
        lado2 = s.nextDouble();

        resultado = lado1 * lado2;

        texto = "A área do seu quadrado é: " + resultado;
        return texto;

    }

    public static String areaDoRetangulo() {
        double base, altura,resultado;
         System.out.println("Digite a base do seu Retangulo:");
         base = s.nextDouble();
         System.out.println("Digite a altura do seu retangulo: ");
         altura = s.nextDouble();

        resultado = base * altura;

        texto = " A área do se retangulo é: " + resultado;

        return texto;

        
    }

    public static String diferençaDeIdade() {
        String nome1,nome2; int idade1,idade2,resultado;

        System.out.println("digite seu nome e idade: ");
        nome1 = s.next();
        idade1 = s.nextInt();

        System.out.println("digite o nome e idade da outra pessoa");
        nome2 = s.next();
        idade2 = s.nextInt();

        if (idade1 > idade2) {
            resultado = idade1 - idade2;
            texto = "O " + nome1 + "é " + resultado +" anos mais velho que " + nome2;
        }else{
            resultado = idade2 - idade1;
            texto = "O " + nome2 + " é " + resultado +" anos mais velho que " + nome1;
        }

        return texto;
    }

}
