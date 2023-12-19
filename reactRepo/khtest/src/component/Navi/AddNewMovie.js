import './AddNewMovie.css'

export default function AddNewMovie(){
 
    return (<>
        <div className="createMovieWrap">
            <h1>Create Movie</h1>
            <input type='text' placeholder='Input movie id'></input>
            <input type='text' placeholder='Input movie title'></input>
            <input type='text' placeholder='Input movie genre'></input>
            <div>출시일: <input type='date'></input></div>
            <button>Add Movie</button>
        </div>
    </>);
}