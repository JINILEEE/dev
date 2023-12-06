// const x = { 
//     name : '홍길동',
//     age : 20
// };

/* 생성자 함수 */
// function Person(x, y){
//     this.name = x;
//     this.age = y;
// }

// Person.prototype.hello = function () {
//     console.log("헬로 ~~~ (부모객체)");
// };



/* 클래스 */
class Person{

    constructor(x, y){
        this.name = x;
        this.age = y;
    }
    hello(){
        console.log('hello ~~~ !!! (생성자 밖에 있는 함수)');
    }
}

class Programmer extends Person {
    constructor(x,y,z){
        super(x,y);
        this.lang = z;
    }
    hello(){
        console.log("hello ~ !");
    }
    coding(){
        console.log("코딩코딩");
    }
}


const p1 = new Programmer('도레미', 20, 'java');
console.log(p1);
p1.hello();
p1.coding();
 

const result = Object.getOwnPropertyNames(p1.__proto__.__proto__);
console.log(result);
console.log(p1.__proto__.__proto__);
