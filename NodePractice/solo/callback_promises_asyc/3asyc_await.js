function returnPromise() {
    return new Promise((resolve, reject) => {
        resolve("promise resolved for await")
    })
}

async function functionCall() {
    const data = await returnPromise();
    console.log("..."+data);
}

functionCall();
