/**
 * In Node.js, events play a crucial role in building asynchronous, event-driven applications.
 * The event system in Node.js is based on the EventEmitter class, which allows objects to emit named events that cause registered listeners to be called.
 *
 * Here's a breakdown of the key components of events in Node.js:
 * EventEmitter Class: This is the core of Node.js's event-driven architecture.
 * It is a built-in class that provides methods to emit events and register event listeners.
 * You can create instances of EventEmitter to add event capabilities to your own objects.
 *
 * Event: An event is a signal that something has happened in your application.
 * Events are represented by string identifiers, such as "data", "error", "connection", etc.
 *
 * Event Listener (or Handler): An event listener is a function that is registered to be notified when a particular event occurs.
 * When an event emitter emits an event, all registered listeners for that event are invoked synchronously, in the order they were added.
 */

const EventEmitter = require("events");

const eventEmitter = new EventEmitter();

eventEmitter.on("bark", function (args) {
  console.log(args);
});

eventEmitter.emit("bark", "booo boo");
