let first = () => {
  return new Promise((res, rej) => {
    res("hello");
  });
};

let second = () => {
  return new Promise((res, rej) => {
    res("hi");
  });
};

let third = () => {
  return new Promise((resolve, reject) => {
    resolve("completed");
  });
};

async function executePromise() {
  let promise = await Promise.all([first(), second(), third()]);
  console.log(promise);
}

executePromise();
