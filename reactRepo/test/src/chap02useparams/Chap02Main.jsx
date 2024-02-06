import React from 'react';
import BoardMain from './BoardMain';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import BoardDetail from './BoardDetail';

const Chap02Main = () => {
    return (
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path="board/*">
                        <Route path="write" element={<h1>게시글작성</h1>} />
                        <Route path="list" element={<h1>게시글 목록</h1>} />
                        <Route path="detail/:no" element={<BoardDetail />} />
                    </Route>
                    <Route path="gallery/*" element={<h1>갤러리메인ㅋㅋ</h1>} />
                    <Route path="notice/*" element={<h1>공지사항 메인ㅋㅋ</h1>} />
                </Routes>
            </BrowserRouter>
        </div>
    );
};

export default Chap02Main;