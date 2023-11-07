// 함수의 선언
function f01(){
    // const x = {};
    // const x = new Object();

    // const a = 10;
    // const b = Number(10);
    // const c = new Number(10);
    
    // console.log(a);
    // console.log(b);
    // console.log(c);

    const str1 = "zzz";                 //글자 자체라 콘솔창에 한줄
    const str2 = new String("zzz");     //객체가 들어간 것이라 토글 열어보면 z가 하나씩 나온다.
    
    console.log(str1);
    console.log(str2);

    // const x = new Date();                    // 현재 시각이 나오게 된다.
    const x = new Date("2023-12-31 10:30");     // 안에 넣어준 값이 출력된다.

    console.log(x);

}

// 함수의 호출
f01();