/**
 * Proto is like pointer used for inheritence
 */
var animal = {
    eats: true,
    walk: function() {
        console.log('animal walking..')
    }
}

var rabbit = {
    name: 'rabby',
    __proto__: animal
}

rabbit.walk();  