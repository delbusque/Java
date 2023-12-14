package functionaIinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumValid.test("+341234567"));
        System.out.println(isPhoneNumValid.and(contains3).test("+441234567"));
        System.out.println(isPhoneNumValid.or(contains3).test("+431234567"));

        Boolean result = isIt.test(true, 190);
        System.out.println("It is: " + result);
    }

    static Predicate<String> isPhoneNumValid = num -> num.length() == 10 && num.startsWith("+44");
    static Predicate<String> contains3 = num -> num.contains("3");

    static BiPredicate<Boolean, Integer> isIt = (flag, num) -> flag && num * num == 100;

}
