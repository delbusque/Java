package functionaIinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int result = incrementByOne.apply(1);
        System.out.println(result);

        System.out.println(incrementAndMultiply.apply(10));

        System.out.println(biFunc.apply(1, 100));
    }

    static Function<Integer, Integer> incrementByOne = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static Function<Integer, Integer> incrementAndMultiply = incrementByOne.andThen(multiplyBy10);
    static BiFunction<Integer, Integer, Integer> biFunc = (a, b) -> (a + 1) * b;


}
