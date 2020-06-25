package aulas.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalTiposPrimitivos {

    public static void main(String[] args) {
        System.out.println("---Valor inteiro opcional---");
        OptionalInt.of(17).ifPresent(System.out::println);

        System.out.println("---Valor decimal opcional---");
        OptionalDouble.of(19.99).ifPresent(System.out::println);

        System.out.println("---Valor Longo  opcional---");
        OptionalLong.of(25L).ifPresent(System.out::println);

    }

}
