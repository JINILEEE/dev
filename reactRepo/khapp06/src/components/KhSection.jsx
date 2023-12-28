import React from "react";
import styled from 'styled-components';

const StyledSectionDiv = styled.div`
    width: 100%;
    height: 100%;
    background-color: #fdffa1;

    & > table {
        width: 80%;
        height: 80%;
        border: 3px solid black;

        & tr{
            background-color: orange;
        }
    }
`;

const KhSection = () => {
    
    return (
        <StyledSectionDiv>
            <table>
                <thead>
                    <tr className='abc'>
                        <th>번호</th>
                        <th>제목</th>
                        <th>내용</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>제목111</td>
                        <td>내용111</td>
                    </tr>
                </tbody>
            </table>
        </StyledSectionDiv>
    );
};

export default KhSection;