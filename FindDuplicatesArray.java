import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesArray {
    public void findDuplicate(String s)
    {
        HashMap<Character,Integer> map=new HashMap();
        char a[]=s.toCharArray();
        for(Character ch: a)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
                map.put(ch, 1);
        }
        Set<Character> keys=map.keySet();

        for(Character ch:keys)
        {
            if(map.get(ch)>1)
            {
                System.out.println(ch + "  is " + map.get(ch) + " times");
            }

        }


    }

    public static void main(String[] args) {
    FindDuplicatesArray findDuplicatesArray=new FindDuplicatesArray();
        String s="Vijaykumarchembeti";
        findDuplicatesArray.findDuplicate(s);
    }


}
