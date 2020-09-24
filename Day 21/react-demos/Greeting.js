import React from 'react';


class Greeting extends React.Component{
    constructor(){
        super()
        this.state={
           isLoggedIn: false 
        }
    }
    render(){

        return this.state.isLoggedIn && <div>Welcome Ram </div>

        //return <div><script>console.log('Hi')</script></div>


     //   return this.state.isLoggedIn ? <div>Welcome Ram </div> : <div>Welcome Guest</div>

     /*  let message;
        if(this.state.isLoggedIn)
            message = <p>Welcome Ram</p>
        else    
            message = <h2>Welcome Guest</h2>
        return <div>{message}</div> 
      */  

      /*  if(this.state.isLoggedIn)
            return <div><h1>Welcome Ram</h1></div>
        else    
            return <div><h2>Welcome Guest</h2> </div>
        */    
    }
}

export default Greeting;