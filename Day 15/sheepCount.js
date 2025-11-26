function countSheep(sheepArray) {
  let count = 0;
  for (let check = 0; check < sheepArray.length; check++) {
    if (sheepArray[check] === true) {
      count++;
    }
  }
  return count;
}
