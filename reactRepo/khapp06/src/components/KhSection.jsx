import React from "react";

const KhSection = () => {
    
    const x = {
        width: '100%',
        height: '100%',
        backgroundColor: 'yellow',
    };
    
    const y = {
        width: '80%',
        height: '80%',
        border: '5px solid black'
    };

    return (
        <div style={x}>
            <table style={y}>
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
        </div>
    );
};

export default KhSection;