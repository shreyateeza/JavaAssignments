import React from 'react'

function sum(props){   
    return (
    <div>
    <h1> {parseInt(props.num1) + parseInt(props.num2) } </h1>
    
    </div>
    );
}

export default sum;