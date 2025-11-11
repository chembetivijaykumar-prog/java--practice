import java.util.HashSet;

public class DupicateSet {
    public static void main(String[] args) {
        int a[] = {21, 21, 45, 21, 50, 49, 50};
        HashSet seen=new HashSet();
        HashSet duplicate=new HashSet();
        for(int num:a)
        {
            if(!seen.add(num))
            {
                duplicate.add(num);
            }
        }
        System.out.println("Duplicate numbers are: " + duplicate);
    }
}
