package weekfive;

public class TrueIfNeitherCatsAndDogsArePresent {
    public static boolean Check(String arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "cat" || arr[i] == "dog") {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args)
    {
        String arr[]={"zebra"};
        System.out.println(Check(arr,1));
    }
}

