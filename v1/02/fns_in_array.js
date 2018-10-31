'use strict';

const offset = [1,2];
const zoom = 2;

const point = { x: 1, y: 1};

const pipeline  = [   // 2D-muunnoksia
    
    function translate(p){
        return { x: p.x + offset[0], y: p.y + offset[1] };
    },

    function scale(p){
        return { x: p.x * zoom, y: p.y * zoom};
    },
    
    function rotate(p) {
        return { x: p.x*Math.cos(180) - p.y*Math.sin(180), y: p.x*Math.sin(180) + p.y*Math.cos(180) };
    }
];


function muunnos(point){
     for(let i=0; i<pipeline.length; i++){   
        console.log("ääää", pipeline[i](point));
        point = pipeline[i](point);
    }
    return point;
}

console.log(point);
console.log(muunnos(point));