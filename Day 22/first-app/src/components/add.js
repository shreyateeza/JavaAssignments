import React from 'react';


class Add extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            x: this.props.num1,
            y: this.props.num2
        }
    }
    
    render(){
        return (
            <div>
             <h1>Sample Class Component</h1>
            <h2>{this.props.num2 - this.props.num1}</h2>
            <h2>{y - x}</h2>
            </div>
            )
    }

   
    
}

export default Add;