const example = [1, 2, 3]

// example.forEach((item, ind) => {
//     console.log()
// })
// const even = example.filter(item => item %2)
// console.log(even)

for(const [item, ind] of example.entries()) {
    console.log(item)
    console.log(ind)
}
    
