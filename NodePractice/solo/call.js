/**
 * Call is a function that helps to change the context of the invoking function.
 * In layman's terms, it helps you replace the value of this inside a function with whatever value you want.
 */

// syntax: func.call(thisObj, args1, args2, ...)

var pokemon = {
  fl: "Pika",
  ll: "chu",
  getPokeName: function () {
    return this.fl + " " + this.ll;
  },
};

var pokemonName = function (snack, hobby) {
  console.log(this.getPokeName() + " likes " + snack + " and " + hobby);
};

pokemonName.call(pokemon, "sushi", "algo");
pokemonName.apply(pokemon, ["sushi", "algo"]);

// serve the exact same purpose. The only difference between how they work is that call() expects all parameters to be passed in individually, whereas apply() expects an array of all of our parameters.
