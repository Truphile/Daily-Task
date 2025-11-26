public static String highestAndLowest(String numbers) {
    String[] nums = numbers.split(" ");
    int max = Integer.parseInt(nums[0]);
    int min = Integer.parseInt(nums[0]);
    for (int check = 1; check < nums.length; check++) {
        int num = Integer.parseInt(nums[check]);
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
    }
    return max + " " + min;
}
