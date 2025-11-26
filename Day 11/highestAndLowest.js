function highestAndLowest(numbers) {
    let nums = numbers.split(" ");
    let max = parseInt(nums[0]);
    let min = parseInt(nums[0]);
    for (let check = 1; check < nums.length; check++) {
        let num = parseInt(nums[check]);
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
    }
    return max + " " + min;
}
