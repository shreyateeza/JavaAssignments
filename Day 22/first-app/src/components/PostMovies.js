import axios from 'axios'
import  React, { Component }  from 'react'


class PostMovies extends Component{
    constructor(){
        super()
        this.state={
            title: '',
            leadRole: ''
        }
    }

    handleChange = event =>{
        const {value, name} = event.target;
        this.setState( { [name] : value})
    }
    handleSubmit = event =>{
        console.log(this.state);
        axios.post('http://localhost:8090/movies', this.state)
        .then( response => {
            console.log(response.data);
        })
    }

    render(){
        return(
            <div>
                <h2>{this.state.title}</h2>
                <form onSubmit={this.handleSubmit}>
                    <label>Movie Title</label>
                    <input type="text" name="title" onChange={this.handleChange} />

                    <label>Lead Role</label>
                    <input type="text" name="leadRole" onChange={this.handleChange} />
                    <button type="submit">Add Movie</button>
                </form>
            </div>
        )
    }
}

export default PostMovies;