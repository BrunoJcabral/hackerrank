package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Teste {
    public static void main(String[] args) {
            /*System.out.println("helloWorld");
            Cinema cinema = Cinema.builder().nome("O vento Levou").autor("Ana Marta").genero("Ficção").build();*/
       /* int number=12, valor=25;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(valor));
        System.out.println(number | valor);
        System.out.println("---------Media---------");
        Arrays.stream(new int [] {2,4,6,8,10}).map(x-> x*x).average().ifPresent(System.out::println);
        System.out.println("-----------------------");
        System.out.println("----------1 a 10------------");
       // IntStream.range(0,11).forEach(System.out::println);
        System.out.println("-----------------------");
        List<Cinema> novaLista = gerarLista().stream().filter(a-> a.getNome().contains("Carlos")).collect(Collectors.toList());
        System.out.println("-----------------------");
        novaLista.stream().forEach(System.out::println);
        List<String> teste = Arrays.asList("A,1,2,3", "B,5,6,7");
        teste.stream().map(x -> x.split(",")).forEach(x-> Arrays.stream(x).forEach(System.out::println));*/


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


