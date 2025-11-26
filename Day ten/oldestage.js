function findOldestAges(array) {
    let maxAge, secondAge;

    if (array[0] > array[1]) {
        maxAge = array[0];
        secondAge = array[1];
    } else {
        maxAge = array[1];
        secondAge = array[0];
    }

    for (let i = 2; i < array.length; i++) {
        let age = array[i];

        if (age > maxAge) {
            secondAge = maxAge;
            maxAge = age;
        } else if (age > secondAge && age < maxAge) {
            secondAge = age;
        }
    }

    return [secondAge, maxAge];
}

let array = [56,1,78,4,90,56,3,12,65,23,100,1,4,6];
console.log(findOldestAges(array)); 
