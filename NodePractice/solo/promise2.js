function delay(millis) {
    return new Promise( (resolve, reject) => {
        setTimeout(() => {
            resolve("executed")
        }, millis)
    })
}

console.log("starting...")
delay(3000).then( (res) => {
    console.log(res)
})