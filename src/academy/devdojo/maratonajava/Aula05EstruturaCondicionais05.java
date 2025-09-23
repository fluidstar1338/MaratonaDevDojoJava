package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicionais05 {
    public static void main(String[] args) {
        //imprima os dias da semana, considerando 1 como domingo
        byte dia = 5;
        //switch so aceita char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F': {
                System.out.println("Mulher");
                break;
            } // é possivel utilizar "{}" mas nao necessario
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
