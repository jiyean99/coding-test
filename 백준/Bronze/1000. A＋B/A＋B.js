const fs = require("fs");

// 백준에서는 /dev/stdin 에서 입력을 읽는 것이 관례
const input = fs.readFileSync(0, "utf8").trim(); // 또는 "/dev/stdin"
const arr = input.split(" "); // 공백 기준으로 자르기

const first = parseInt(arr[0], 10);
const second = parseInt(arr[1], 10);

console.log(first + second);