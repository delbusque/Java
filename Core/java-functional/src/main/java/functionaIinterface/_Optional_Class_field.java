package functionaIinterface;

import java.util.Optional;

public class _Optional_Class_field {
    public static void main(String[] args) {

        Person person = new Person("Johny", null);

        String email = person.getEmail()
                .map(String::toUpperCase)
                .orElse("bum@bum");

        person.getEmail()
                .map(String::toUpperCase)
                .ifPresentOrElse(System.out::println, () -> System.out.println("email is not provided"));

        System.out.println(email);

        Person mihal = new Person("Mihal", "mihal@mihal");

        if (mihal.getEmail().isPresent()) {
            email = mihal.getEmail().get();
            System.out.println(email.toUpperCase());
        }
    }

    static class Person {
        private final String name;
        private final String email;

        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
