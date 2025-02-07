/**
 * Self-invoking functions, also known as Immediately Invoked Function Expressions (IIFEs), 
 * are functions in JavaScript that are executed immediately after they are defined. 
 * They are typically wrapped inside parentheses and followed by an additional pair of parentheses to invoke them. 
 */

(function() {
    var counter = 0;

    function incrementCounter() {
        counter++;
        console.log("Counter:", counter);
    }

    // Expose only the incrementCounter function to the outside world
    global.incrementCounter = incrementCounter;
})();

// This will throw an error because counter is not accessible outside the self-invoking function
// console.log(counter);

incrementCounter(); // This will work because incrementCounter is exposed globally
incrementCounter(); // This will work because incrementCounter is exposed globally
