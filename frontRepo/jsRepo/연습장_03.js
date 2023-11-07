console.log("로딩 끝 ~~~!!");

// function fff(){

//     return {
//         name : "피카츄",
//         hp : 100
//     };

// }

// const result = fff();
// console.log(result);


// function Pokemon(a, b){
//     this.name = a;
//     this.hp = b;
//     this.attack = function(){
//         console.log("백만볼트~!");
//     }
// }

// const pika = new Pokemon("피카츄", 100);   // new 를 붙여줘야 연산자로서 사용이 가능하다.
// console.log(pika);

// // function createPokemon(a){
// //     const obj = {};
// //     obj.name = a;
// //     return obj;
// // }

// const temp = createPokemon("피카츄");
// console.log(temp);

//===============================================================

// class Person{
//     name = "홍길동";
//     age = 20;
//     sayHello(){
//         console.log("hello~!");
//     }
// }

// const p = new Person();
// console.log(p);
// p.sayHello();

//===============================================================

// 함수는 선언을 했으므로 f01 함수자체는 존재를 하는 것이다. 하지만 실행은 아직 안됐으므로 cnt 라는 변수는 없는것이다.
function f01(){
    const cnt = 123;
    const obj = {};
    obj.printCnt = function(){
        console.log(cnt);
    }
    return obj;
}

const obj = f01();  //여기까지하면 f01 함수가 진행되고 끝나면 const obj 는 더이상 존재하지 않음
obj.printCnt();  // 따라서 이 값이 나올 수 없다... 하지만 참조 변수들은 자신을 참조하는 것이 없을때 사라진다.