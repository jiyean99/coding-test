const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim();
const n = Number(input);

const facIter = (num) => {
  let result = 1;
  for (let i = 2; i <= num; i++) {
    result *= i;
  }
  return result;
};

console.log(facIter(n));
