class Logger{

    constructor(name) {
        this.name = name
    }

    info(message) {
        console.log("info -> ", this.name +' ' +message)
    }

    verbose(message) {
        console.log("verbose -> ", this.name +' ' +message)
    }
}

module.exports = Logger