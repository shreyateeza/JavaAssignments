import React from 'react'

function EventsDemo(props){

    function clickHandler(){
        console.log('Button Clicked');
    }

    return(
        <button onClick={clickHandler}>Click Me</button>
    );
}

export default EventsDemo;