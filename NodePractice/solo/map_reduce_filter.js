const x = [1, 2, 3, 4];

const test = x.reduce((res, currItem) => {
  return res + currItem;
}, 5);
console.log("test -> ", test);

const y = x.map((item) => item * 2);
const z = x.filter((item) => item % 2 == 0);

const q = ["asb", "nnn"];
const p = q.reduce((res, item) => {
  res[item] = item.length;
  return res;
}, {});

console.log(y);
console.log(z);
console.log(p);
