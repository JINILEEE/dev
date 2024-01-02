import React from 'react';
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

    const handleClickJoin = () => {
        navigate('/member/join');
    };

    return (
        <StyledHeaderDiv>
            <div>빈칸</div>
            <div className='logoArea' onClick={ () => { navigate("/") } }></div>
            <StyledLoginAreaDiv>
                <form>
                    <input type="text" name="id" placeholder='아이디' />
                    <input type="password" name="pwd" placeholder='패스워드' />
                    <input type="button" value="회원가입" onClick={ handleClickJoin } />
                    <input type="submit" value="로그인" />

                </form>
            </StyledLoginAreaDiv>
        </StyledHeaderDiv>
    );
};

export default Header;