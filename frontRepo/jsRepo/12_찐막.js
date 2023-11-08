//[복습1] 
//window.onload = function(){
//     const btn = document.querySelector('#idDupCheckBtn');
//     btn.addEventListener("click", function(){
//         const inputTag = document.querySelector('input[name=memberId]');
//         const str = inputTag.value;
//         if(str.length<1){
//             alert("아이디를 입력하세요!");
//             return;
//         }
//         if(str === "admin" || str === "ADMIN"){
//             alert("사용불가능한 아이디 입니다.")
//             inputTag.value = "";        // input 태그 안의 글자 다 지워줌!!
//             // inputTag.style.backgroundColor = "red";
//             inputTag.classList.add("red");     // red 클래스를 더해준다는 의미!!!
//             return;
//         }
//         alert("사용 가능한 아이디입니다.");
//     });
//}

/////////////////////////////////////////////////////////////////////////////////////
//[문제2] 클릭할때마다 div 가 빨간색 -> 원래색 -> 빨간색 -> ... 으로 변경이 되는것 & 1 초마다 변경되는 것

// window.onload = function(){
//     const target = document.querySelector('#target');

//     target.addEventListener("click", function(event){
//         console.log(event.target);                      //내가 원하는 target div를 콘솔에 잘 출력함
//         const divTag = event.target;

//         divTag.classList.toggle("red");  

//     });
// }

// // window.setInterval(함수 ,  시간 (ms 단위));
// window.setInterval(function(){
//     const target = document.querySelector('#target');
//     target.click();
// }, 1000);

/////////////////////////////////////////////////////////////////////////////////////
//[문제3] 처음부터 프런트엔드에 체크되어 있도록

// window.onload= function(){
//     const fe = document.querySelector("#fe");
//     fe.checked = true;

//     const op = document.querySelector('#op');
//     op.selected = true;
// }

/////////////////////////////////////////////////////////////////////////////////////

function toggleAside(){
    const aside = document.querySelector("aside.aside-left");
    aside.classList.toggle("active");
}