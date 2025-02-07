// by default everything is private, whatever needed to be public needs to be exported

export function log(message){
    console.log(message)
}

export function secondlog(message) {
    console.log(message)
}

export const DEFAULT_LEVEL = 'info';

export class Check{
    constructor(message) {
        this.message = message
    }
}

//you can use default exports here by following syntax and use custom name while import

export default function() {
    console.log("default function")
}