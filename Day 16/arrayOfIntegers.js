function reverseCount(n) {
  let result = [];
  for (let check = n; check >= 1; check--) {
    result.push(check);
  }
  return result;
}
let n = 5;
console.log(reverseCount(n))