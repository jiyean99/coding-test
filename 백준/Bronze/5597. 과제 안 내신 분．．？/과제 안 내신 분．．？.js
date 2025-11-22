const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n").map(Number);

const submitted = Array(31).fill(false);

for (let n of input) {
    submitted[n] = true;
}

for (let i = 1; i <= 30; i++) {
    if (!submitted[i]) {
        console.log(i);
    }
}
