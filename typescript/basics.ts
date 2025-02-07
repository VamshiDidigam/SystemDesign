console.log(Math.round(33.33));

/**
 * string
 * number
 * boolean
 */

// let movieTitle: string = "Devara";
// let age: number = 2;
// let isAction: boolean= true;

type Point = {
    x: number;
    y: number;
}

function doublePoint(point: Point): Point {
    return {x: point.x*2, y:point.y*2};
}

console.log(doublePoint({x: 2, y:4}));