import React from 'react';
import { useKhMemory } from '../context/KhContext';

const Main = () => {

    const {cnt, plus} = useKhMemory();

    return (
        <>
            <h1>
                Mainnnnnnnn
            </h1>
            <h3 onClick={plus}>{cnt}</h3>
        </>
    );
};

export default Main;