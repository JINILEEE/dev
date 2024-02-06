import React from 'react';
import { useCntContext } from '../context/CntContext';

const DisplayCnt = () => {
    const value = useCntContext();   //해당 컨텍스트에서 value 를 가져옴

    return (
        <h1 onClick={ ()=>{
            console.log("디스플레이 카운트가 알고있는 value ::: " , value);
        } }>디스플레이 카운트 : {value.cnt}</h1>
    );
};

export default DisplayCnt;