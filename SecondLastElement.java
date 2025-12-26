import java.util.*;
import java.util.stream.Collectors;

public class SecondLastElement {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(20);
        l.add(40);
        l.add(110);
        l.add(70);
       int second= l.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
       System.out.println(second);

       int a[]={10,30,20,33,9,40};
    int[] b = Arrays.asList(a).stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

        System.out.println(b);



    }
}
