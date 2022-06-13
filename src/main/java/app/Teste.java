package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Teste {
    public static void main(String[] args) {
            /*System.out.println("helloWorld");
            Cinema cinema = Cinema.builder().nome("O vento Levou").autor("Ana Marta").genero("Ficção").build();*/
        int number=12, valor=25;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(valor));
        System.out.println(number | valor);

        IntStream.range(0,11).forEach(System.out::println);
        gerarLista().stream().filter(a-> a.getNome().contains("")).forEach(System.out::println);

    }

    public static List<Cinema> gerarLista(){
        List<Cinema> cinemas = new ArrayList<Cinema>();
        cinemas.add(Cinema.builder().nome("São Luis").autor("Carlos").genero("Masculino").build());
        cinemas.add(Cinema.builder().nome("Alegro Recife").autor("Fernando ").genero("Masculino").build());
        cinemas.add(Cinema.builder().nome("Recife").autor("Pessoa").genero("Masculino").build());
        cinemas.add(Cinema.builder().nome("São Carlos").autor("Thais").genero("Feminno").build());
        cinemas.add(Cinema.builder().nome("João Pereira").autor("Cinthia").genero("Feminno").build());
        cinemas.add(Cinema.builder().nome("Ciganos").autor("Val").genero("Feminno").build());
        cinemas.add(Cinema.builder().nome("Luz").autor("Maria Clara").genero("Feminno").build());
        cinemas.add(Cinema.builder().nome("Jesus Cristo").autor("João").genero("Masculino").build());
        cinemas.add(Cinema.builder().nome("Deus").autor("Dayvinho").genero("Indefinido").build());

        return cinemas;
    }
}


