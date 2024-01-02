import React from 'react';
import { Route, Routes } from 'react-router-dom';
import MemberJoin from './MemberJoin';
import MemberEdit from './MemberEdit';
import ErrorPageNotFound from '../error/ErrorPageNotFound';

const MemberMain = () => {
    return (
        <Routes>
            <Route path='/join' element={ <MemberJoin />}/>
            <Route path='/edit' element={<MemberEdit />}/>
            {/* 아래 내용 없으면 경로 이상한것 넣었을 때 오른쪽 aside가 가운데로 온다!!! */}
            <Route path='*' element={<ErrorPageNotFound />}/>
        </Routes>
    );
};

export default MemberMain;