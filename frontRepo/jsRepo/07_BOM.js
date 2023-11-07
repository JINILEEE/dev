function f01(){
    //open
    //window.open("https://www.naver.com", "abc", "width=800, height=800"); 


    //setTimeout
    //window.setTimeout(동작, 시간);
    // window.setTimeout(()=> {
    //     console.log("3초 지났음~~~");
    // }, 3000);

    //setInterval
    // window.setInterval(()=>{               //앞에 window 생략해도 된다.
    //     console.log("인터벌 ~~~");
    // }, 3000);          

    const abcTab = window.open("https://www.naver.com", "abc");

    window.closeTimeout( () => {
        abcTab.close();
    }, 3000);

    clearTimeout(closeTimer);
    //clearInterver(타이머);

}

function f02(){
    
    console.log(location);
    //location.href = "https://www.naver.com";

    location.reload();  // 새로고침
    
}

function f03(){
    console.log(history);
    history.forward();
    history.back();
    history.go(-2);
}

function f04(){
    console.log(navigator);
    console.log(screen);
}

f04();
