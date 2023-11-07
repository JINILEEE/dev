function f01(){

    const x = document.createTextNode("ㅎㅇㅎㅇ");

    const result = document.querySelector("#result");
    result.appendChild(x);

}

function f02(){

    const x = document.createElement('h1');
    const t = document.createTextNode("JS로 만든 텍스트!!");

    x.appendChild(t);

    const result = document.querySelector("#result");
    result.appendChild(x);
}

function f03(){
    
    // 태그로 가져올 때는 반드시 querySelectorAll 로 가져와야한다!!!
    const elemArr = document.querySelectorAll("h1");
    elemArr[2].remove();    // 이러면 버튼 누를때마다 3번째 h1값이 지워지게 된다!!!

}

