// observe the file extensios in import and filename, mjs. Normal js wont work here because we need to tell node that this is ES6 

import example, { log, DEFAULT_LEVEL } from './es6exports.mjs'

log("test")
console.log(DEFAULT_LEVEL)
example()