package app;

public class Teste {
    public static void main(String[] args) {
            System.out.println("helloWorld");
            Cinema cinema = Cinema.builder().nome("O vento Levou").autor("Ana Marta").genero("Ficção").build();
        System.out.println(cinema.toString());
    }


}


