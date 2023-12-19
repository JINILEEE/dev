import{BrowserRouter, Routes, Route} from "react-router-dom";
import Footer from "./Footer";
import Header from "./Header";
import Navigator from "./Navigator";
import BookInsert from "./BookInsert";
import BookList from "./BookList";

export default function Wrap (){
    return (<>
    <BrowserRouter /><BrowserRouter>
        <div className="kh">
            <Header />
            <Navigator />

            <Routes>
                <Route path="/book/list" element={<BookList />} />
                <Route path="/book/insert" element={<BookInsert />} />
            </Routes>

            <Footer />
        </div>
    </BrowserRouter>
    </>);
}
