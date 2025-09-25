package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        //condicao é que o valor da parcela precisa ser >= 1000

        double valorTotal = 200000;
        double parcelas;
        double qtdParcelas;
        int x = 0;

        do {
            parcelas = valorTotal / x;
            x++;
        }while (parcelas > 1000);

        qtdParcelas = valorTotal / parcelas;
        System.out.println("Valor das parcelas: "+ parcelas);
        System.out.println("Quantidade de parcelas: "+ qtdParcelas);


    }
}
