def highest_and_lowest(numbers):
    nums = numbers.split()
    max_num = int(nums[0])
    min_num = int(nums[0])
    for num_str in nums[1:]:
        num = int(num_str)
        if num > max_num:
            max_num = num
        if num < min_num:
            min_num = num
    return f"{max_num} {min_num}"
