import axios from 'axios'
import  React, { Component }  from 'react'
import table from 'react-bootstrap';


class GetMovies extends Component{
    constructor(){
        super()
        this.state={
            movies:[]
        }
    }

    render(){
        return(
            <div>
                <h2>List of Movies</h2>
                    <table className="table table-bordered">
                        <tr><th>Title</th> <th>Lead Role</th> <th>Release Date</th> <th>Budget</th></tr>
                        <tbody>{
                         this.state.movies.map(movie => 
                         <tr><td>{movie.title}</td> <td>{movie.leadRole}</td><td>{movie.releaseDate}</td><td>{movie.budget}</td></tr>
                            )
                            }</tbody> 
                    </table>
            </div>
        )
    }

    componentDidMount(){        
        axios.get('http://localhost:8090/movies')
            .then(response => {
                this.setState({ movies : response.data})
                console.log(response);
            })
    }

}

export default GetMovies;