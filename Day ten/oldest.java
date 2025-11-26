public class Main {

    public static int[] findOldestAges(int[] array) {
        int maxAge, secondAge;

        if (array[0] > array[1]) {
            maxAge = array[0];
            secondAge = array[1];
        } else {
            maxAge = array[1];
            secondAge = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            int age = array[i];

            if (age > maxAge) {
                secondAge = maxAge;
                maxAge = age;
            } else if (age > secondAge && age < maxAge) {
                secondAge = age;
            }
        }

        return new int[]{ secondAge, maxAge };
    }

    public static void main(String[] args) {
        int[] array = {56,1,78,4,90,56,3,12,65,23,100,1,4,6};
        int[] result = findOldestAges(array);

        System.out.println("Second largest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
