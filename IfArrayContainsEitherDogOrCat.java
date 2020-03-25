package weekfive;
public class IfArrayContainsEitherDogOrCat {
    public static boolean Check(String arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "cat" || arr[i] == "dog") {
                return true;
            } else {
                return false;
            }
        }
      return false;
    }
    public static void main(String[]args)
    {
        String arr[]={"dog","zebra"};
        System.out.println(Check(arr,1));
    }
}




