import java.util.*;


public class RemoveNonDuplicate {
    public static void main(String[] args) {
        String[] arr = {"AA", "BB", "AA", "CC", "DD", "DD"};

        Map<String, Integer> map = new HashMap<>();

// Count frequency
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> list=new ArrayList<>();
        for(String s:arr)
        {
            if(map.get(s)>1)
            {
                list.add(s);
            }
        }
        System.out.println(list);

    }
}
