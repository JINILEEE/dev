import { useContext } from "react";
import { useState } from "react";
import { createContext } from "react";

const KhMemory = createContext();
// const KhMemory2 = createContext();
// const KhMemory3 = createContext();

const KhMemoryProvider = ({children}) => {

    const [cnt, setCnt] = useState(1);

    const plus = () => {
        setCnt(cnt+1);
    }

    const obj = {
        "cnt" : cnt,
        "plus": plus
    };

    return (<>
        <KhMemory.Provider value={obj}>
            {children}
        </KhMemory.Provider>
    </>);
};

const useKhMemory = () => {
    const obj = useContext(KhMemory);
    return obj;
}

// export {KhMemory, KhMemory2, KhMemory3};
export {KhMemoryProvider, useKhMemory};