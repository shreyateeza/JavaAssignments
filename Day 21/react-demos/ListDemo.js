import React from 'react'

function listDemo(){
    const names = ['Ram', 'Shyam', 'Kamal'];
    const nameList = names.map( name => <li>{name}</li>);

    const books = [
        {id:'1',title:'The Chamber of Secret', author:'J K Rowling'},
        {id:'2',title:'The Power of subconcious mind', author:'Someone'},
        {id:'3',title:'Lord of the rings', author:'J R R'}
    ]
   
    //const bookList = books.map(book => <li key={book.id}>{book.id} - {book.title} by {book.author}</li>)
    const bookList = books.map(book => <dl> <dt>{book.title}</dt> <dd> {book.author}</dd></dl>)

    //const bookList = books.map(book => <tr> <td>{book.title}</td> <td> {book.author}</td></tr>)
    return(
        <div>
            
            {bookList}
           {<table border="1">{bookList}</table>
           <ul>{nameList}</ul>
            <ol>{nameList}</ol>
            <ul>{bookList}</ul>}
        </div>
    )

}

export default listDemo;