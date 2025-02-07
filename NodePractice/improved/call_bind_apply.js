function greet(name){
    console.log(`hello ${name}. This is from ${this.type}`)
}

const person = {
    type: "call"
}

greet.call(person, "alex")
greet.apply(person, ["alex"])

const bindCal = greet.bind(person)
bindCal("alex")