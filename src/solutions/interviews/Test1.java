package solutions.interviews;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class Test1 {

    public static void main(String[] args) {
        int tcn = ThreadLocalRandom.current().nextInt(10000, 100001);
        System.out.println(tcn);

//        String a = "";
//        System.out.println(a.length());
//        System.out.println(a.isBlank());
//
//        System.out.println(a.isEmpty());
//
//        a.strip();

        String a = null;
        Optional<String> str = Optional.ofNullable(a);
        System.out.println(str.isEmpty());

        System.out.println(1/2);

    }
}
