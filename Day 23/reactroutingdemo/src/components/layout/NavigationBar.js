import React from 'react'
import { Link } from 'react-router-dom';


const NavigationBar = () => {
    return (
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <a class="navbar-brand" href="#">MovieBase</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <Link class="nav-link" to="/">Home</Link>
                    </li>
                    <li class="nav-item">
                        <Link class="nav-link" to="/movies">Movies</Link>
                    </li>
                    <li class="nav-item">
                        <Link class="nav-link" to="/about">About</Link>
                    </li>      
                    <li class="nav-item">
                        <Link class="nav-link" to="/contact">Contact</Link>
                    </li>                
                </ul>

                <Link className="btn btn-outline-light" to="/movies/add">Add Movie</Link>
                
  </div>
</nav>
    )
}

export default NavigationBar;
