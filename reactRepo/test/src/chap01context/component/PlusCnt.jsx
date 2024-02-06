import React from 'react';
import { useCntContext } from '../context/CntContext';

const PlusCnt = () => {
    let {cnt, setCnt} = useCntContext();   //해당 컨텍스트에서 value 를 가져옴

    return (
        <h1 onClick={ ()=>{
            setCnt(cnt+1);
        } } >플러스 카운트</h1>
    );
};

export default PlusCnt;