import axios from 'axios'
import  React, { Component }  from 'react'


class GetDemo extends Component{
    constructor(){
        super()
        this.state={
            users:[]
        }
    }

    render(){
        return(
            <div>
                <h2>List of Users</h2>
                    <ol> {this.state.users.map(user => <li key={user.id}>{user.id} - {user.name} - {user.email}</li>)} </ol>
            </div>
        )
    }

    componentDidMount(){        
        axios.get('https://jsonplaceholder.typicode.com/users')
            .then(response => {
                this.setState({ users : response.data})
                console.log(response);

            })
    }

}

export default GetDemo;