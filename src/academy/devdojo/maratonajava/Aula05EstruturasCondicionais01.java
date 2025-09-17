package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado");
        }else {
            System.out.println("Não é autorizado");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado");
        }

        if(isAutorizadoComprarBebida == false) {
            System.out.println("Não Autorizado");
        }

    }
}
