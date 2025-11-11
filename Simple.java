public class Simple {
    public static void main(String[] args) {
        System.out.println("welcome back to java preparation");
        int a[] = {21, 21, 45, 21, 50, 49, 50};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate found" + a[i]);
                    break;
                } else {
                    System.out.println("Duplicates not found");
                }
            }
        }
    }
}