package devandroid.bitan.appgaseta.apoio;

public class UtilGasEta {

    public void metodoEstatico(){}

    public static void metodoNaoEstatico(){}

    public static String mensagem(){
        return "Qualquer mensagem...";
    }

    public static double preco(){
        return 9.99;
    }

    public static String calcularMelhorOpcao(double gasolina, double etanol){
        // preco da gasolina: R$ 5,12
        // preco do etanol: R$ 3,99

        // preco ideal  = gasolina * 0,70 = R$ 3,548

        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if(etanol<=precoIdeal){
            mensagemDeRetorno = "Abasteça com ETANOL";
        }else {
            mensagemDeRetorno = "Abasteça com GASOLINA";
        }

        return mensagemDeRetorno;
    }

}
