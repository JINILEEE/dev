function login(){
    const memberIdInput = document.querySelector('input[name=memberId]');
    const memberPwdInput = document.querySelector('input[name=memberPWd]');

    if(memberIdInput.value.length <1){
        alert("아이디를 입력해주세요.");
        memberIdInput.focus();
        return false;
    }
    if(memberPwdInput.value.length <1){
        alert("비밀번호를 입력해주세요.");
        memberPwdInput.focus();
        return false;  
    }
    alert("로그인 성공!! 환영합니다.");
    return true;
}