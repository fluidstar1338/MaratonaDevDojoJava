package academy.devdojo.maratonajava;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double valor padrao = 0
        //char = '\u0000'
        //boolean = false
        //String = null

        String [] nomes = new String[4];
        nomes[0] = "Vivian";
        nomes[1] = "Joao";
        nomes[2] = "Lucas";
        nomes[3] = "Bianca";

        for(int i = 0; i <= nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5];

    }
}
