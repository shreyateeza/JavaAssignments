import React from 'react'
import { Link } from 'react-router-dom'

const Home = () => {

    return (
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>
                        <Link class="btn btn-primary mr-2">View</Link>
                        <Link class="btn btn-outline-primary mr-2">Edit</Link>
                        <Link class="btn btn-danger">Delete</Link>
                    </td>
                </tr>
               
            </tbody>
        </table>
    )

}

export default Home;