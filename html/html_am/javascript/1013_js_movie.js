// focus(), click이 빠졌을 때(blur)
window.onload = function(){
    var input = document.getElementsByClassName("movie");

    for(var i in input){
        input[i].addEventListener("focus", function(){
            this.classList.add("active");
        });
        input[i].addEventListener("blur", function(){
            this.classList.remove("active");
        });
    }
};

/*
    객체: 대표성을 지닌 독립적 존재. 사물, 사람, 동물, 식물 등...
    모든 객체는 자신만의 속성(특징)과 행동을 갖는다.

    객체의 속성(변수)
    객체의 행동(함수)

    객체정의: 추상화(본질적인 부분만을 남기고 세부사항을 전부 쳐내는 작업)
    추상화의 기본: 속서오가 행동을 나열하고 구성.
    멤버 변수: 객체의 속성(type, id, class, ...)을 구성.
    멤버 함수: 객체의 속성을 기반으로 행동을 구현하는 코드.

    객체 생성: new 연산을 통해 생성
    생성된 객체는 변수에 저장하여 사용하는데 이 변수를 참조변수라고 한다.
    참조변수: ram의 주서를 저장하는 변수
*/

var obj = new Object();