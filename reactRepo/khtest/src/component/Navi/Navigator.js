import {Link} from "react-router-dom";
import './Navigator.css';

export default function Navigator(){

    return (<>

        <div className="choose">
            <Link to="/list">List</Link><Link to="/add/movie">Add New Movie</Link>
        </div>
    </>);

}