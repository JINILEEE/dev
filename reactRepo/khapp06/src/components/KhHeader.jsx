import React from 'react';

const KhHeader = () => {

    const x = {
        width : '100vw',
        height : '20vh',
        backgroundColor : 'gray',
        display : 'grid',
        gridTemplateRows : '1fr',
        gridTemplateColumns : '1fr 3fr 1fr',
    }

    return (
        <div style={x}>
            <div>빈칸</div>
            <div>로고</div>
            <div>로그인영역</div>
        </div>
    );
}

export default KhHeader;