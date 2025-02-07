function returnPromise() {
    return  new Promise( (resolve, reject) => {
        resolve("promise returned");
    })
}

returnPromise().then( (data) => {
        console.log("....."+ data);
    }
)