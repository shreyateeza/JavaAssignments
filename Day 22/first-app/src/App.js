import React from 'react';
import logo from './logo.svg';
import './App.css';
import GreetComponent from './components/greet'
import Info from './components/info'
import Demo from './components/demo';
import Sample from './components/sample';
import Sum from './components/sum';
//import Add from './components/add';
import Greeting from './components/Greeting';
import List from './components/ListDemo';
import EventsDemo from './components/EventsDemo'
import EventHandling from './components/EventHandling';
import GetDemo from './components/GetDemo';
import GetMovies from './components/GetMovies';
import PostMovies from './components/PostMovies';

function App() {
 // return <div><Greet/> <Greet/>  </div>
 return (
    <div>
      
      
      
       <GetMovies />
       {/*
       <PostMovies />
      <GetDemo />
      <EventHandling />
      <EventsDemo />
      <List />
      <Greeting />
      
      <Sum num1="20" num2="30" />
      <Info color="orange"/>
      <Add num1="100" num2="200" />
      
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
