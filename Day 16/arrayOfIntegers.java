import java.util.ArrayList;

public class ArrayOfInteger {

    public static ArrayList<Integer> reverseCount(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int check = n; check >= 1; check--) {
            result.add(check);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> reversedArray = reverseCount(n);
        System.out.println(reversedArray);
    }
}
