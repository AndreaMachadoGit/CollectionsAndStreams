package aulas.collections.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamApi {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // count() - Retorna a contagem dos elementos da Stream
        System.out.println("A stream tem " +estudantes.stream().count() + " elementos  ");

        // max() - Retorna o elemento com o maior número de letras
        System.out.println("O elemento com maior numero de letras é " +
            estudantes.stream()
            .max(Comparator.comparingInt(String::length)));

        // min() - Retorna o elemento com o menor número de letras
        System.out.println("O elemento com menor numero de letras é " +
            estudantes.stream()
            .min(Comparator.comparingInt(String::length)));

        // filter() - Retorna uma nova coleção contendo os elementos que tem a letra R no nome
        System.out.println("lista de elementos com a letra R " +
            estudantes.stream()
            .filter((estudante) -> estudante.toLowerCase().contains("r"))
            .collect(Collectors.toList()));

        // map() -  Retorna uma nova coleção com os nomes concatenados a qtde de letras de cada nome
        System.out.println("nomes + nro de letras " +
            estudantes.stream()
            .map(estudante -> estudante.concat(" - ")
            .concat(String.valueOf(estudante.length())))
            .collect(Collectors.toList()));

        // limit() -   Retorna somente os 3 primeiros elementos da coleção
        System.out.println("os tres primeiros elementos da coleção são " +
            estudantes.stream()
            .limit(3)
            .collect(Collectors.toList()));

        // peek() - exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos com peek() " +
            estudantes.stream()
            .peek(System.out::println)
            .collect(Collectors.toList()));

        // forEach() - Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos com forEach ");
            estudantes.stream().forEach(System.out::println);

        // allMatch() - Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Todos os elementos tem a letra W ? " +
            estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // anyMatch() - Retorna true se qualquer um os elementos possuem a condição "a letra a no nome"
        System.out.println("Algum elementos tem a letra a ? " +
            estudantes.stream().anyMatch((elemento) -> elemento.toLowerCase().contains("a")));

        // noneMatch() - Retorna true se nenhum dos elementos possuem a condição "a letra a no nome"
        System.out.println("Nenhum elementos tem a letra a ? " +
            estudantes.stream().noneMatch((elemento) -> elemento.toLowerCase().contains("a")));

        // findFirst() - Retorna o primeiro elemento da coleção, se existir (não dá nullPointerException)
        System.out.print("O primeiro elemento da coleção é o : ");
            estudantes.stream().findFirst().ifPresent(System.out::println);

         //Exemplo de operação encadeada
        System.out.println("Operação encadeada ");
        System.out.println(estudantes.stream()
            .peek(System.out::println)
            .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
            .peek(System.out::println)
            .filter((estudante) -> estudante.toLowerCase().contains("r"))
            //.collect(Collectors.toList())); // colect to list
            //.collect(Collectors.joining(", "))); // junta a virgula entre os elementos
            //.collect(Collectors.toSet())); // o set  não garante a ordem
            .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1))));
    }
}

