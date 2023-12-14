package streams;

import static streams._Stream.Gender.MALE;
import static streams._Stream.Gender.FEMALE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Bobby", Gender.PREFER_NOT_TO_SAY),
                new Person("Alice", FEMALE));

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Boolean match = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));

        Boolean anyMatch = people.stream()
                .anyMatch(person -> MALE.equals(person.gender));

        Boolean nonMatch = people.stream()
                .noneMatch(person -> Gender.TRANSE.equals(person.gender));

        System.out.println(match);
        System.out.println(anyMatch);
        System.out.println(nonMatch);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY, TRANSE
    }
}
