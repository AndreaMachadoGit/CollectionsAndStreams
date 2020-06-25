package aulas.optional;


import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("teste");
        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que nao esta presente");
        optionalNull.ifPresentOrElse(System.out::println,() -> System.out.println("null = Não está presente"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Valor opcional que nao esta presente - com empty");
        optionalEmpty.ifPresentOrElse(System.out::println,() -> System.out.println("empty = Não está presente"));

        // quando usa Optional.of(null) -> dá o erro NullPointerException

    }


}
