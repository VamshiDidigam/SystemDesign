function minTablesNeeded(arr) {
  //sort by start time and then by type
  let events = [];
  arr.forEach((el) => {
    events.push({ time: el[0], type: "start" });
    events.push({ time: el[1], type: "end" });
  });

  events.sort((a, b) => {
    if (a.time == b.time) {
      return a.type === "start" ? -1 : 1;
    } else {
      return a.time - b.time;
    }
  });

  let minTablesRequired = 0;
  let currentTables = 0;

  for (const event of events) {
    if (event.type === "start") {
      currentTables++;
      minTablesRequired = Math.max(minTablesRequired, currentTables);
    } else {
      currentTables--;
    }
  }

  return minTablesRequired;
}

const reservations = [
  [8, 10],
  [2, 3],
  [7, 9],
];

console.log(minTablesNeeded(reservations));
