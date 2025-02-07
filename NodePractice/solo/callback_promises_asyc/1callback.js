function printsomething(callback) {

    return callback("something");
}

printsomething((arg) => console.log("...."+arg))