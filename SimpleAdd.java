import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleAdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        List<String> result = Arrays.stream(arr)
                .mapToObj(n -> n + (n % 2 == 0 ? "E" : "O"))
                .toList();

        System.out.println(result);

    }
}
