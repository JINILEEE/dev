import React from 'react';
import { useParams } from 'react-router-dom';

const BoardDetail = () => {

    const x = useParams();
    console.log("x ::: " , x);

    return (
        <h1>
            {x.no}번 게시글 상세조회
        </h1>
    );
};

export default BoardDetail;