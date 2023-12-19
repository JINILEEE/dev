import './List.css';

export default function List(){
    
    const Movie1 ={
        id: "1",
        title: "Movie 1",
        genre: "Drama",
        release_date: "2022-01-01",
        action: "Delete"
    };
    const Movie2 ={
        id: "2",
        title: "Movie 2",
        genre: "Action",
        release_date: "2022-02-01",
        action: "Delete"
    };
    const Movie3 ={
        id: "3",
        title: "Movie 3",
        genre: "romance",
        release_date: "2022-03-01",
        action: "Delete"
    };
    

    const movieList = [Movie1, Movie2, Movie3];
    
    return (<>
        <div className="movieListWrap">
            <h1>Movies</h1>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Genre</th>
                        <th>Release Date</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    { movieList.map( (x) => {
                        return <tr>
                            <td>{ x.id }</td>
                            <td>{ x.title }</td>
                            <td>{ x.genre }</td>
                            <td>{ x.release_date }</td>
                            <td><button>{ x.action }</button></td>
                        </tr>;
                    } ) }
                </tbody>
            </table>
        </div>
    </>);
}