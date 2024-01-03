import React from 'react';
import styled from 'styled-components';

const StyledNaviDiv = styled.div`
    width: 100%;
    height: 100%;
    display: grid;
    grid-template-rows: 1fr;
    grid-auto-columns: 1fr;
    grid-auto-flow: column;
    place-items: center center;
    background-color: #F4CE14;
    color: white;
    font-size: 2rem;
    border-top: 5px solid white;
`;

const Navi = () => {
    return (
        <StyledNaviDiv>
            <div>게시판</div>
            <div>공지사항</div>
            <div>갤러리</div>
        </StyledNaviDiv>
    );
};

export default Navi;