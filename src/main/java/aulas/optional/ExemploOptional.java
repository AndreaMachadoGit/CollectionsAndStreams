package aulas.optional;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Opcional");

        System.out.println(optionalString.isPresent());

        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        if (optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        optionalString.map((valor)-> valor.concat("****")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);

    }

}
