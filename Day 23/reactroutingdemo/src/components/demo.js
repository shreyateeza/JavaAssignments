import React from 'react';


class Demo extends React.Component{
    render(){
        return (
            <div>
             <h1>Demo Class Component</h1>
             <h2>Demo Topic :- {this.props.topic}</h2>
            </div>
            )
    }
}

export default Demo;