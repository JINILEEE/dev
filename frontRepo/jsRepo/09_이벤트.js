function f02(){
    console.log("f02 called...");
}

// window.onload = () => {
//     const btn03 = document.querySelector("#btn03");
//     // btn03.addEventListener(이벤트 , 함수);
//     btn03.addEventListener('click' , () => {
//         console.log("f03 called...");
//     });
// };

// window.onload = () => {
//     const btn01 = document.querySelector('#btn01');
//     btn01.onclick = () => {
//         console.log("f01 called...");
//     };
// };

/* 
위의 상태로 진행하면 버튼 3은 눌리지 않는다... 아래의 1번이 동일한 window.onload 를 덮어썼기 때문에...
아래와 같이 묶어서 하나의 함수 안에 넣어 실행해주면 된다.
*/

window.onload = () => {
    const btn03 = document.querySelector("#btn03");
    // btn03.addEventListener(이벤트 , 함수);
    btn03.addEventListener('click' , () => {
        console.log("f03 called...");
    });
    const btn01 = document.querySelector('#btn01');
    btn01.onclick = () => {
        console.log("f01 called...");
    };
};

function f04(){
    alert("a태그 클릭 ㅋㅋ 네이버로 이동 ???");    
}

function f05(){
    
    const memberIdInput = document.querySelector('input[name=memberId]');
    alert(memberIdInput.value);
    const memberPwdInput = document.querySelector('input[name=memberPwd]');
    alert(memberPwdInput.value);
    const memberPwd2Input = document.querySelector('input[name=memberPwd2]');
    alert(memberPwd2Input.value);
    const memberNickInput = document.querySelector('input[name=memberNick]');
    alert(memberNickInput.value);

    if(memberIdInput.value.length <1){
        alert("아이디는 빈칸일 수 없습니다.");
        memberIdInput.focus();
        return false;  // 회원가입 ㄴㄴ // 아이디 이상
    }
    if(memberPwdInput.value.length <1){
        alert("비밀번호는 빈칸일 수 없습니다.");
        return false;  
    }
    if(memberPwd2Input.value.length <1){
        alert("비밀번호 확인은 빈칸일 수 없습니다.");
        return false;  
    }
    if(memberNickInput.value.length <1){
        alert("닉네임은 빈칸일 수 없습니다.");
        return false;  
    }

    if(memberPwdInput.value !== memberPwd2Input.value){
        alert("비밀번호 & 비밀번호확인 을 동일하게 작성하세요!");
        return false;
    }
    
    return true;  // 회원가입 진행
}