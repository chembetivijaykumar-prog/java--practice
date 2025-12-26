import java.util.Arrays;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {6, 5, 4, 3, 2, 1};

        boolean result = arraysEqual(a, b);
        System.out.println(result); // true
    }

    private static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

