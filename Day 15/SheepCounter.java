public class SheepCounter {
    public static int countNumberOfSheeps(boolean[] sheepArray) {
        int check = 0;
        for (boolean present : sheepArray) {
            if (present) check++;
        }
        return check;
    }

    public static void main(String[] args) {
        boolean[] sheep = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false, false, true, true};
        System.out.println(countNumberOfSheeps(sheep)); 
    }
}
