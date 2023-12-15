package functionaIinterface;

import java.util.Optional;
import java.util.OptionalInt;

public class _Optional {
    public static void main(String[] args) {

        Optional<Integer> optInt = Optional.ofNullable(null);

        System.out.println(optInt.orElse(12));

        optInt.ifPresentOrElse(System.out::println, () -> System.out.println(33));


        Optional<String> hello = Optional.of("Hello World");

        System.out.println(hello.isEmpty());

        String greet = hello
                .map(String::toUpperCase)
                .orElse("Hi there");

        System.out.println(greet);


        Optional<String> empty = Optional.empty();

        String suplierStr = "I`m the suplier";

        System.out.println(empty.orElseGet(() -> suplierStr));


        Optional<String> notEmpty = Optional.of("Not empty");

        System.out.println(notEmpty.get());

        System.out.println(empty.or(() -> notEmpty).get());
    }
}
