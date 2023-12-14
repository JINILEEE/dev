function Counter (){
    let x = 0;

    function plus (){
        x++;
    }

    return <>
        <h1>카운터 값 : {x}</h1>
        <button onClick={plus}>플러스</button>
    </>;
}

export default Counter;