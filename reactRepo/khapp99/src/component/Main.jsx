import React from 'react';
import styled from 'styled-components';
import Aside from './Aside';
import {Routes, Route} from 'react-router-dom';
import BoardMain from './board/BoardMain';
import NoticeMain from './notice/NoticeMain';
import GalleryMain from './gallery/GalleryMain';
import MemberMain from './member/MemberMain';
import ErrorPageNotFound from './error/ErrorPageNotFound';

const StyledMainDiv = styled.div`
    width: 100%;
    height: 100%;
    display: grid;
    grid-template-columns: 1.5fr 7fr 1.5fr;
    grid-template-rows: 1fr;
    place-items: center center;
`;

const Main = () => {
    return (
        <StyledMainDiv>
            <Aside x='https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTAzMDVfMTYy%2FMDAxNTUxNzIxNDgyMzQy.vbTrbMLDbK2WvsTdmh0FWgPJw5mpq2_BY5gCTu_G_2Mg.HvTmcWrze-OcKr70RgcIcH9r1Bstf68iWvFhQ3oJz5Yg.JPEG.scr91726%2F190301_%25BC%25AD%25C3%25A4%25B8%25AE_%25B1%25A4%25B0%25ED%25C6%25F7%25BD%25BA%25C5%25CD.jpg&type=a340' />

            <Routes>
                <Route path='/' element={<h1>환영합니다!!!</h1>}></Route>
                <Route path='/member/*' element={ <MemberMain /> }></Route>
                <Route path='/board/*' element={ <BoardMain /> }></Route>
                <Route path='/notice/*' element={ <NoticeMain /> }></Route>
                <Route path='/gallery/*' element={ <GalleryMain /> }></Route>
                <Route path='*' element={ <ErrorPageNotFound /> }></Route>
            </Routes>

            <Aside x='https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNzEyMDFfMjAw%2FMDAxNTEyMTE4NTI2NjI0.iookq3-xzFsaSlIprT--ERoM21VZzA8uFKH86BA7YVMg.R6yb-kazHp-Uf0U325uNfXLjvjIinDbNNJwrNCBE7TIg.JPEG.manbo10000%2FKakaoTalk_2017-12-01-17-43-21_Photo_4.jpeg&type=a340' />
        </StyledMainDiv>
    );
};

export default Main;