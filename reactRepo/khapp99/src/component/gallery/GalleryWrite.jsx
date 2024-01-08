import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import styled from 'styled-components'

const StyledGalleryWriteDiv = styled.div`
    width: 100%;
    height: 100%;
    background-color: #b2dfff;
    & > form{
        width: 100%;
        height: 100%;
        display: flex;
        flex-direction: column;
        justify-content: space-evenly;
        align-items: center;
    }
`;

const GalleryWrite = () => {

    const [title, setTitle] = useState();
    const [fileObj, setFileObj] = useState();

    const handleChangeTitle = (e) => {
        // 해당 input 태그 안에 유저가 입력한 값
        setTitle(e.target.value);
    };
    const handleChangeFile = (e) => {
        // 해당 input 태그 안에 유저가 입력한 파일 객체를 가져오는 것
        setFileObj(e.target.files[0]);
    };

    const navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();

        const fd = new FormData();
        fd.append("title", title);
        fd.append("f", fileObj);
        fd.append("writerNo", 1); //sessionStorage.getItem("loginMember")

        fetch("http://127.0.0.1:8888/app/api/gallery", {
            method: "POST",
            body: fd, 
        })
        .then( resp => resp.json() )
        .then( data => {
            if(data.msg === "good"){
                alert("갤러리 작성 완료!");
                navigate("/gallery/list");
            }else{
                alert("갤러리 작성 실패...");
            }
        } )
        ;
    };

    return (
        <StyledGalleryWriteDiv>
            <form onSubmit={handleSubmit}>
                <input type="text" name='title' placeholder='제목을 작성하세요.' onChange={handleChangeTitle}/>
                <input type="file" name='f' onChange={handleChangeFile}/>
                <input type="submit" value='작성하기'/>
            </form>
        </StyledGalleryWriteDiv>
    );
};

export default GalleryWrite;