package simulaçãoDeContaBancaria;

public class boleto {
    private String codDeBarras;
    private String nomeDoBeneficiario;
    private String nomeDoPagador;
    private double valor;

    public boleto (String codDeBarras,String nomeDoBenefeciario, String nomeDoPagador, double valor){
        this.codDeBarras = codDeBarras;
        this.nomeDoBeneficiario = nomeDoBenefeciario;
        this.nomeDoPagador = nomeDoPagador;
        this.valor = valor;

    }

    public void exibirDadosDoBoleto(){
        System.out.println("Informações do boleto");
        System.out.println("\nCodigo de barras "+codDeBarras);
        System.out.println("Nome do beneficiario "+ nomeDoBeneficiario);
        System.out.println("Nome do pagador " + nomeDoPagador);
        System.out.println("valor do boleto " + valor);
        

    }

    public Double pegarValor (){
        return valor;
    }


}
