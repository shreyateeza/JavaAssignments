import React from 'react';
import './App.css';

import {BrowserRouter as Router, Route} from 'react-router-dom'
import GetMovies from './components/GetMovies';
import PostMovies from './components/PostMovies'
import NavigationBar from './components/layout/NavigationBar';
import Home from './components/Home'

function App() { 
 return (
    <Router>
      <NavigationBar />
      <Route exact path="/" component={Home} />
      <Route path="/about" component={About} />
      <Route path="/contact" component={Contact} />
      <Route exact path="/movies" component={GetMovies} />
      <Route path="/movies/add" component={PostMovies} />
    </Router>
 );
}

/*function Home(){
  return(
    <div>
      <h2>My Sweet Home Page</h2>
    </div>
  )
}*/

function About(){
  return(
    <div>
      <h2>Know About Me Here!!!!!</h2>
    </div>
  )
}

function Contact(){
  return(
    <div>
      <h2>Contact Us @123456789</h2>
    </div>
  )
}


export default App;
