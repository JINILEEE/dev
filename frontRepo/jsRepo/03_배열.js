function f01() {
    arr01 = new Array();
    arr02 = new Array(3);                                  // 미리 사이즈를 지정해 둔 배열
    arr03 = new Array("핸드폰", '페브리즈', 100, true, null);  // 값(타입 구분없이) 을 미리 지정해 둔 배열
    arr04 = [];                                            // arr01 과 동일하게 작성된 것이므로 잘 알아두기!!!
    arr05 = ["핸드폰", '페브리즈', 100, true, null];           // arr03 과 동일!! 앞으로 이런 대괄호 타입으로 작성할 것!
    arr06 = [];
    arr06[0] = '하나';
    arr06[1] = '둘';
    arr06[7] = '셋';            // 이렇게 작성해도 된다. 0,1,7 번이 출력되는 것이고 2~6까지는 empty 상태인 것이다.

    console.log(arr01);
    console.log(arr02);
    console.log(arr03);
    console.log(arr04);
    console.log(arr05);
    console.log(arr06);
}

//f01();

function f02 () {
    const arr = ["사과", "귤" , "파인애플" , "골드키위"];

    // indexOf()   배열에서 요소가 위치한 인덱스를 반환한다.
    const x = arr.indexOf("파인애플");
   console.log(x);

    // concat()    여러 개의 배열을 결합하여 새로운 배열을 리턴한다.
    const y = arr.concat("사과" , "귤");
    console.log(y);

    // join()      배열의 요소들을 결합해서 하나의 문자열로 반환한다.
    // reverse()   원본 배열의 순서를 뒤집는 메소드이다.
    // sort()      배열을 오름차순(문자기준)으로 정렬하는 메소드이다.
    // push()      배열의 맨 뒤에 요소를 추가한다.
    const z = arr.push("샤인머스캣");
    console.log(z);
    console.log(arr);

    // pop()       배열의 맨 뒤에 요소를 반환 후 제거한다.
    // shift()     배열의 맨 앞의 요소를 반환 후 제거한다.
    // unshift()   배열의 맨 앞의 요소를 추가한다.
    // slice()     배열의 요소를 뽑아내는 메소드이다.
    // splice()    배열의 특정 인덱스 위치에 요소 제거 및 추가하는 메소드이다.
    const a = arr.splice(1,3,'zzz');
    console.log(a);

}

f02();