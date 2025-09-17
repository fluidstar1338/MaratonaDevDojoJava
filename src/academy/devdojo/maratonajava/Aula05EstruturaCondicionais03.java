package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        //doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 ao devdojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";

        //operador ternario = (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        //outra forma de fazer
        String resultado2 = salario > 5000 ? "Eu vou doar 500 ao devdojo": "Ainda nao tenho condicoes, mas vou ter!";

        boolean possoDoar = salario > 5000;

        System.out.println(resultado);
    }
}
