import React from 'react';


class Sample extends React.Component{
    constructor(){
        super()
        this.state = {
            message: "React is very Interesting",
            content: "All available"
        }
    }
    render(){
        return (
            <div>
             <h1>Sample Class Component</h1>
            <h2>{this.state.message} - {this.state.content}</h2>
            </div>
            )
    }
}

export default Sample;