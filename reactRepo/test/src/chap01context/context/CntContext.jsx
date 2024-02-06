import { createContext, useContext, useState } from "react";

const CntContext = createContext();

const useCntContext = ()=>{
    return useContext(CntContext);
};

const CntContextProvider = (props)=>{

    const [cnt , setCnt] = useState(10);

    const obj = {
        cnt,
        setCnt,
    };

    return <>
        <CntContext.Provider value={obj}>
            {props.children}
        </CntContext.Provider>
    </>;
};




export {useCntContext, CntContextProvider}