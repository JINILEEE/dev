import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import styled from 'styled-components';

const StyledHeaderDiv = styled.div`
    width: 100%;
    height: 100%;
    display: grid;
    grid-template-columns: 1fr 3fr 1fr;
    grid-template-rows: 1fr;
    & > .logoArea{
        background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0xV0wvfjulAeFoVTW_NC9N66mdvxwNLbaF6O0LGHjnJP-2ytAlFU4dHFNbttQD8bSXfU&usqp=CAU);
        background-repeat: no-repeat;
        background-size: contain;
        background-position: center center;
    }
`;

// MEMBER > login 관련
const StyledLoginAreaDiv = styled.div`
    width: 100%;
    height: 100%;
    & > form {
        width: 100%;
        height: 100%;
        display: grid;
        grid-template-columns: 1fr 1fr;
        grid-template-rows: repeat(3 , 1fr);
        place-items: center center;
        & > input {
            width: 100%;
            height: 100%;
        }
        & > input:nth-child(1),
        & > input:nth-child(2) {
            grid-column: span 2;
        }
    }
`;

const Header = () => {
    
    const navigate = useNavigate();
    let [loginMemberVo, setLoginMemberVo] = useState(null);

    const handleClickJoin = () => {
        navigate('/member/join');
    };

    const [vo, setVo] = useState();

    const handleInputChange = (event) => {
        
        const {name, value} = event.target;

        setVo({
            ...vo ,
            [name]: value
        });
    }

    const handleClickLogin = (event) => {

        event.preventDefault();

        fetch("http://127.0.0.1:8888/app/rest/member/login", {
            method: "POST",
            headers: {
                "Content-Type" : "application/json"
            },
            body: JSON.stringify(vo)
        })
        .then( (resp) => { return resp.json() } )
        .then( (data) => { 
            if(data.msg === "good"){
                alert("로그인 성공!");
                setLoginMemberVo(data.loginMember);
                console.log("loginMemberVo", loginMemberVo);
            }else{
                alert("로그인 실패...");
            }
         } )
        .catch( (e) => {console.log(e);} )
        .finally( () => {console.log("로그인 fetch 끝!!!");} )
        ;
        
    }

    return (
        <StyledHeaderDiv>
            <div>빈칸</div>
            <div className='logoArea' onClick={ () => { navigate("/") } }></div>
            {
                loginMemberVo === null 
                ?
                <StyledLoginAreaDiv>
                    <form onSubmit={handleClickLogin}>
                        <input type="text" name="id" placeholder='아이디' onChange={handleInputChange}/>
                        <input type="password" name="pwd" placeholder='패스워드' onChange={handleInputChange}/>
                        <input type="button" value="회원가입" onClick={ handleClickJoin } />
                        <input type="submit" value="로그인" />

                    </form>
                </StyledLoginAreaDiv>
                :
                <div>
                    <h3>{ loginMemberVo.nick }님 환영합니다.</h3>
                </div>
            }
        </StyledHeaderDiv>
    );
};

export default Header;