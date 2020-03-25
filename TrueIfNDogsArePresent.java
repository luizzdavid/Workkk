package weekfive;
public class TrueIfNDogsArePresent {
    public static boolean Check(String arr[], int n) {
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
    public static void main(String[]args)
    {
        String arr[]={"zebra","cat","dog","dog"};
        System.out.println(Check(arr,3));
    }
}


