package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade <=18 categoria juvenil
        //idade >= 18 categoria adulto

        int idade = 12;
        String categoria;

        if(idade < 15) {
            categoria = ("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            categoria = ("Categoria juvenil");
        }else{
            categoria = ("Categoria Adulto");
        }
        //outra forma de fazer com operador ternario
        categoria = idade < 15 ? "categoria infantil" : idade >= 15 && idade < 18 ? "categoria juvenil" : "categoria adulto";
        System.out.println(categoria);
    }
}
