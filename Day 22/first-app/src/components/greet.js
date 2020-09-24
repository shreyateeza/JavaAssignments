import React from 'react'

function greet(props){
    console.log(props);
   // props.name = 'Hari'; // can't modify name property - immutable
    return (
    <div>
    <h1>Greeting To {props.name} from {props.location}</h1>
    {props.children}
    </div>
    );
}


//const greet = () => <h1>Greeting To All</h1>

export default greet;