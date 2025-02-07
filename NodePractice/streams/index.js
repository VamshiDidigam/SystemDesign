/**
 * Streams are objects for handling I/O data incrementally (e.g., reading files piece by piece).
    Types of Streams:
    Readable: Data flows from source to application (e.g., fs.createReadStream).
    Writable: Data flows from application to destination (e.g., fs.createWriteStream).
    Duplex: Both readable and writable (e.g., TCP socket).
    Transform: Modifies the data (e.g., zlib compression).
 */

const fs = require('fs');

const readStream = fs.createReadStream('input.txt');
const writeStream = fs.createWriteStream('output.txt');