package functionaIinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "+359123");
        greetCustomer.accept(maria);

        changeNumber.accept(maria, "+44789");
        System.out.println(maria.getPhoneNumber());
        greetCustomer.accept(maria);

        hideNumber.accept(maria, true);

    }

    static Consumer<Customer> greetCustomer = customer -> System.out.println("Hello " + customer.name
            + ". Thanks for registering with " + customer.phoneNumber + " !");

    static BiConsumer<Customer, String> changeNumber = Customer::setPhoneNumber;
    static BiConsumer<Customer, Boolean> hideNumber = (customer, hideNumber) -> System.out.println("Hello " + customer.name
            + ". Thanks for registering with " + (hideNumber ? "******" : customer.phoneNumber) + " !");

    static class Customer {
        private final String name;
        private String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public void setPhoneNumber(String newNumber) {
            this.phoneNumber = newNumber;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }
    }
}
