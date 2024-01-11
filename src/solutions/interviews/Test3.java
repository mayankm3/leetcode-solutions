package solutions.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test3 {

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        List<String> arr = Arrays.asList("apple", "banana", "blueberry", "grapes");

        Optional<String> res = arr.stream().filter(ele->ele.startsWith("b")).findFirst();

        String out = "";

        if(!Optional.of(res).isEmpty()) out = res.get();
        System.out.println(out);
    }
}
