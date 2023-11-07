// window.onload = function(){

//     const target = document.querySelector("#target"); //html쪽 코트 해설하는 순서가 여기가 먼저가 되므로 반드시
//                                                       //html쪽이 무조건 먼저 해석되도록!!!  window.onload 사용
//     target.addEventListener("click", function(x){    // x 는 이벤트 정보를 받기위해 작성한 것
       
//         const str = "010-1234-1234";

//         const reg = /[0-9]{3}-[0-9]{4}-[0-9]{4}/;

//         //reg.test(str);
//         const result = reg.test(str);
//         console.log(result);

//     });

// };

///////////////////////////////////////////////////////////////////////////////////////////////////////

// window.onload = function(){

//     const target = document.querySelector("#target"); //html쪽 코트 해설하는 순서가 여기가 먼저가 되므로 반드시
//                                                       //html쪽이 무조건 먼저 해석되도록!!!  
//     target.addEventListener("click", function(x){    // x 는 이벤트 정보를 받기위해 작성한 것
       
//         const str = "hello abworldc";      //abc 가 없으므로 결과는 false가 나온다.

//         const reg = /abc/;

//         //reg.test(str);
//         const result = reg.test(str);
//         console.log(result);

//     });

// };

///////////////////////////////////////////////////////////////////////////////////////////////////////

// window.onload = function(){

//     const target = document.querySelector("#target"); //html쪽 코트 해설하는 순서가 여기가 먼저가 되므로 반드시
//                                                       //html쪽이 무조건 먼저 해석되도록!!!  
//     target.addEventListener("click", function(x){    // x 는 이벤트 정보를 받기위해 작성한 것
       
//         const str = "hello aworld";       // a와  b,c 가 하나라도 존재하므로 출력시 true 값 나온다.

//         const reg = /[abc]/;          // [] 사용하면 정확히 abc가 붙어 있는게 아니라 여기 있는게 해당하는 부분이 하나라도 있으면 매칭해서 확인

//         //reg.test(str);
//         const result = reg.test(str);
//         console.log(result);

//     });

// };

///////////////////////////////////////////////////////////////////////////////////////////////////////

// window.onload = function(){

//     const target = document.querySelector("#target"); //html쪽 코트 해설하는 순서가 여기가 먼저가 되므로 반드시
//                                                       //html쪽이 무조건 먼저 해석되도록!!!  
//     target.addEventListener("click", function(x){    // x 는 이벤트 정보를 받기위해 작성한 것
       
//         const str = "zhello 3abworldc";       // a와  b,c 가 하나라도 존재하므로 출력시 true 값 나온다.

//         const reg = /[zxc]/;          

//         //reg.test(str);
//         const result = str.replace(reg , "VVV");  //reg에 해당하는 문구가 있다면 그것을 V로 변경해준다는 의미
//         console.log(result);

//     });

// };

///////////////////////////////////////////////////////////////////////////////////////////////////////

window.onload = function(){

    const target = document.querySelector("#target"); //html쪽 코트 해설하는 순서가 여기가 먼저가 되므로 반드시
                                                      //html쪽이 무조건 먼저 해석되도록!!!  
    target.addEventListener("click", function(x){    // x 는 이벤트 정보를 받기위해 작성한 것
       
        //const str = "zhelloC 3abworldc";       // a와  b,c 가 하나라도 존재하므로 출력시 true 값 나온다.
        
        // const reg = /[zxc]/g;               // 뒤에 g를 붙이면 전역에 있는 것들을 모두 찾아준다는 의미이다.
        //const reg = /[zxc]/ig;               // 뒤에 g를 붙이면 전역에 있는 것들을 모두 대소문자 상관없이 찾아준다는 의미이다.
        //const reg = /[a-z]/ig;                 // a부터 z까지의 대소문자 구분없는 모든글자들 
        //const reg = /[a-zA-Z]/g;                 // a부터 z까지의 대소문자 구분없는 모든글자들 
        //const reg = /[\D]/g;                 // Decimal(숫자)가 아닌 공백을 포함한 모든것들
        
        
        const str = "010-1234-1234";       // a와  b,c 가 하나라도 존재하므로 출력시 true 값 나온다.
        const reg = /^[\d]{3}-[\d]{3,4}-[\d]{4}$/;    // [\d]: 숫자가 {3}: 2번 반복 {3,4}: 3번이나 4번 반복한다.
                                                      // ^: 시작하는 사인   $: 끝났다는 표시 
        //reg.test(str);
        //const result = str.replace(reg , "VVV");  //reg에 해당하는 문구가 있다면 그것을 V로 변경해준다는 의미
        const result = reg.test(str);  
        console.log(result);

    });

};