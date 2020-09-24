import React from 'react';
import logo from './logo.svg';
import './App.css';
import GreetComponent from './components/greet'
import Info from './components/info'
import Demo from './components/demo';
import Sample from './components/sample';
import Sum from './components/sum';
import Add from './components/add';
function App() {
 // return <div><Greet/> <Greet/>  </div>
 return (
    <div>

      <Sum num1="20" num2="30" />
      <Info color="orange"/>
      <Add num1="100" num2="200" />
      {/*
        <GreetComponent name="Ram" location="Lucknow">
          <p>Good Morning</p>
         </GreetComponent>  
        <GreetComponent/>
         
        <Demo topic="React" /> 
        <Sample />
      */}


    </div>
 );
}

export default App;
