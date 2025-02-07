//The following you can use to export multiple variables
exports.variable = "asd";
exports.variable2 = "asd2";

// the below is wrong because if you want to replace whole exports objects then we need to use module.exports and shown in last function
// exports = () => {
//     console.log("test");
// }

// using the following you can only export one object
// module.exports = () => {
//   console.log("test");
//   return "hello";
// };
