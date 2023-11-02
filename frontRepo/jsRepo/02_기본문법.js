function f01(){  
    let x = 10;
    console.log(x);
} // 함수를 선언만 한 상태라 여기서 끝나면 당연히 콘솔에 안보인다!!!

// f01(); // 이렇게 호출을 해야 콘솔창에 확인할 수 있다.

function f02(){
    // const x = 10;
    // console.log(typeof(String(x))); // x 의 타입을 알 수 있다.

    if(10 == '10'){                 // 숫자 10과 문자열 '10' 은 다른데 똑같다고 인식한다.(값만 체크하는 것이라...)
        console.log("이프");
    }else{
        console.log("엘스");
    }

    if(10 === '10'){                 // === 를 사용하면 숫자 10과 문자열 '10' 은 다르다고 인식한다.(타입까지 체크해주는 것)
        console.log("이프");
    }else{
        console.log("엘스");
    }

    if(10 !== '10'){                 // 부정문 사용방법
        console.log("이프");
    }else{
        console.log("엘스");
    }
}

f02();