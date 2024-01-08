import React from 'react';
import styled from 'styled-components';

const StyledWrapDiv = styled.div`
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
`;

const GallertListItem = ({a, b}) => {
    
    return (
        <StyledWrapDiv>
            <img 
                src={b} 
                alt='사진~~~'
                width='100px'
                height='100px'
            />
            <span>{a}</span>
        </StyledWrapDiv>
    );
};

export default GallertListItem;