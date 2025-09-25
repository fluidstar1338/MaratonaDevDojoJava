package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }
        do {
            System.out.println("dentro do dowhile " + ++count);
        }while (count < 15);

        for (int i = 0; i < 10; i++) {
            System.out.println("for "+ i);
        }
    }
}
