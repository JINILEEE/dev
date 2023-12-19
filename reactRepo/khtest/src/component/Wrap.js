import{BrowserRouter, Routes, Route} from "react-router-dom";
import Navigator from "./Navi/Navigator";
import AddNewMovie from "./Navi/AddNewMovie";
import List from "./Navi/List";

export default function Wrap (){
    return(<>
       <BrowserRouter />
       <BrowserRouter>
       <Navigator />
            <Routes>
                <Route path="/list" element={<List />} />
                <Route path="/add/movie" element={<AddNewMovie />} />
            </Routes>
       </BrowserRouter>
        
    </>);
}