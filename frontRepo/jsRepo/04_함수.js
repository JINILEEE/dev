const testBtn = document.querySelector("#testBtn");

/* 
testBtn.addEventListener(어떤이벤트, 함수);    '어떤이벤트' 가 발생하면 '함수'가 실행된다!!!
testBtn.addEventListener("click", f01);       // f01() 이렇게 작성하면 함수를 미리 실행한다는 의미라서 f01함수의 리턴값이 들어가게 되는 것이다!!!
                                              // f01 이렇게 괄호 없어야 클릭하면 함수를 돌린다는 의미이다.
function f01(){
    alert('f01 called...');
}                                             // 함수 호출보다 실행이 먼저 와도 잘 작동한다!!(컴퓨터가 자동으로 가장 먼저 호출을 해주므로)
*/

/* 
// 익명함수
testBtn.addEventListener("click", alert(123)); // 이것도 alert에 괄호가 존재하므로 클릭을 안해도 바로 실행된다!!!
testBtn.addEventListener("click", function(){alert("f01실행 ~~~");}); // 이렇게 함수자체를 넣어줄 경우에는 함수의 이름을 지을 필요가 없다.
const x = () => {};  이렇게 작성하면 계속해서 호출 가능한 상태가 된다.
*/

/*
// 화살표함수 (arrow function) -> 자주 사용하니 잘 알아두자!!!
() => {
    alert('화살표 함수');

testBtn.addEventListener("click", () => {
    alert('화살표 함수 실행 ~~~');
});
*/

/*
// 자동실행함수
(
    function hello(){
    alert("hello ~~~");
    }
)();                        // 바로 호출이 되도록 뒤에 (); 를 붙이면 된다.
*/


/* 
매개변수
- 매개변수 갯수가 함수에서의 갯수보다 많아도 함수에서의 갯수만큼만 출력 / 그보다 적으면 NaN(Not a Number: 숫자가 아니다.) 뜬다.
*/
/*
function testFunc(a, b){
    alert(a+b);
    console.log(arguments);
}
*/

// 전달받은 모든 값들을 더하는 함수
function textFunc(){

    let temp = 0;
    for(let i = 0; i < arguments.length; ++i){
        temp += arguments[i];
    }
    alert(temp);
}

function testReturn(){
    const fff = (str) => {alert(str);}; 

    return fff;
}

function myFunc(){
    const x = testReturn();  // 리턴값(여기선 'fff')을 받아올 뿐이다.
    console.log(x);
    x('xxxxxxx');  // x를 실행해준다 -> x는 testReturn을 실행하는 것이고 
}                  //변수 fff에 'xxxxxxx'값을 넣고 함수를 진행한다는 의미!! 