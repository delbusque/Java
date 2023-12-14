package functionaIinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        List<String> urls = dbUrls.get();
        System.out.println(urls);
    }

    static Supplier<List<String>> dbUrls = () -> List.of("db://4000", "db:/5000", "db:6000");
}
