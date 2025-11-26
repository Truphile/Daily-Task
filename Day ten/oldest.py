def find_oldest_ages(array):
    if array[0] > array[1]:
        max_age = array[0]
        second_age = array[1]
    else:
        max_age = array[1]
        second_age = array[0]

    for age in array[2:]:
        if age > max_age:
            second_age = max_age
            max_age = age
        elif second_age < age < max_age:
            second_age = age

    return [second_age, max_age]


array = [56,1,78,4,90,56,3,12,65,23,100,1,4,6]
print(find_oldest_ages(array))