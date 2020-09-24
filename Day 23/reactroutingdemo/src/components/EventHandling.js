import React from 'react';


class EventHandling extends React.Component{
    constructor(){
        super();
        this.state = {
            count: 0
        }
        this.consClickHandler = this.consClickHandler.bind(this)
    }

    increment=()=>{  
        this.setState({
            count: this.state.count + 1
        })     
        
    } 

    propClickHandler = () =>{
        console.log('Property Handler... clicked');
    }
    /*increment(){  
        this.setState({
            count: this.state.count + 1
        })             
    }*/

    clickHandler(){
        console.log('Button clicked');
    }

    alickHandler(){
        console.log('Another button clicked')
    }

    consClickHandler(){
        console.log('Constructor bind.. clicked....')
    }

    render(){        
           return( 
           <div>
               <h2>{this.state.count}</h2>
            <button onClick={this.clickHandler.bind(this)}>1.Binding Handler in render()</button>
            <button onClick={()=>this.alickHandler()}>2.Arrow Function in render()</button>
            <button onClick={this.consClickHandler}>3.Constructor Binding</button>
            <button onClick={this.propClickHandler}>4.Handler As Property</button>
            


           {/* <button onClick={this.increment}>Increment</button> */}
           </div>

            )
    }
}

export default EventHandling;