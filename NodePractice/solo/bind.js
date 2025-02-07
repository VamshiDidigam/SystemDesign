/**
 * The bind() method creates a new function that, when called, has its this keyword set to the provided value
 */

var pokemon = {
    fl: "Pika",
    ll: 'chu',
    getPokeName: function() {
        return this.fl + " " + this.ll;
    }
}


var pokemonName = function() {
    console.log(this.getPokeName())
}

var newFun = pokemonName.bind(pokemon);
newFun();