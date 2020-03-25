package weekfive;
public class TrueOnlyIfNDogsOrNCatsArePresent {
    public static boolean Checkdog(String arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "dog") {
                n -= 1;
            }
        }
        System.out.println(n);
        if (n == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean Checkcat(String arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "cat") {
                n -= 1;
            }
        }
        System.out.println(n);
        if (n == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[]args)
    {
        String arr[]={"zebra","cat","dog","dog","dog"};
        System.out.println(Checkdog(arr,3));
        System.out.println(Checkcat(arr,3));

    }
}
