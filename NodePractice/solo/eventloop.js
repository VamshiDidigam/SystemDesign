/**
 * The event loop in JavaScript allows it to behave asynchronously 
 * and carry out non-blocking I/O operations even though it’s a single-threaded language. 
 * The event loop is responsible for executing code, collecting and processing events, and carrying out queued sub-tasks.
 */

console.log("starting")

setTimeout( () => {
    console.log("test")
}, 1000)

console.log("ended")

/**
 * o/p: 
 * starting
 * ended
 * test
 */