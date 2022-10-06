// 함수: 코드의 모듈화. 재사용성 및 유지보수 효율성이 좋다.
// 모듈에는 이름을 지정, 모듈에 삽입할 사항과 출력값에대 한 확인이 필요

/*
    input 태그로부터 데이터를 입력받아 해당 데이터가 유효한지 검사하고,
    저장하는 위치에 공간이 확보되었는지 확인 후, 
    파일을 저장하기 위해 파일이 생성되었는지 확인. 
    만약 생성되었다면 파일에 저장.
*/

/*
    b input 태그로부터 데이터를 입력받는 경우
    1. 함수에 데이터를 입력 2. 함수 호출 3. 함수 실행
    함수 함수 함수 실행이 뭔 뜻이고
*/

// 함수 메소드 차이점
// 함수: 독립적 코드. 언제든지 호출 가능 || 메소드: 귀속되어 사용되는 코드.

// 함수의 구성: 선언부 및 정의부, 실행부 선언부 및 정의부 >> 함수 모듈의 출력 형태와 이름, 삽입되는 사항과 코드블럭이 추가되어있는 부분

/*  
    정의부
    function func1(obj1, obj2){
        res = obj1 + obj2;
        return res;
    }
*/
/*
    실행부
    func1(10, 20);

    함수 실행순서
    브라우저 실행 > HTML 엘리먼트 호출 > 코드 해석 > 함수 발견 > 함수 실행 > 함수 실행 완료 후 호출 위치로 복귀 > 원래 코드 실행

    변수의 존속성
    변수의 지역성: 변수는 기본적으로 코드블럭 내에서만 존재(코드블럭: {})
    
    변수 선언 후 코드 블럭이 종료될 때 까지 메모리상에 존재(지역변수)
    코드 블럭 내 선언 변수는 모두 지역 변수이다.
    함수 실행 시 현재까지 실행되던 내역은 모두 스택이라는 메모리 영역에 보관 후 실행 함수로 제어를 이동하여 초기화 > 함수 실행이 완료되면 초기화된 변수들은 메모리 영역에서 삭제

    지역 변수는 코드 블럭에서만 사용 가능: 코드 블럭 실행 시 생성되어 코드 블럭 종료 시 삭제

    변수의 전역성: 코드 블럭 외부에서 선언된 변수
    모든 코드 블럭에서 사용 가능
    전역 변수는 프로그램 자체가 종료되는 시점에서 제거.

    함수 간 통신 방법(데이터 이동)
    함수는 기본적으로 폐쇄적 구조 형태 > 함수 간 데이터 공유 불가
    
    함수간 통신을 실행할 수 있는 방법: 데이터 삽입부와 출력부를 이용해 통신
    데이터 삽입(인수(파라미터(매개변수), 매개변수)) 실행함수에 데이터 전달

    function(a, b){return (a + b);} > 함수 선언
    sum(10, 20); > 함수를 호출해 10과 20이란 데이터를 매개변수 a와 b에 전달
    a = 10, b = 20 저장

    반환값: 실행부에서 호출부로 전달하는 데이터
*/

/*
// 원하는 숫자 법위의 총 합 구하기
var res1 = total(5, 20); 
var res2 = total(13, 55);
document.write(res1 + "<br>")
document.write(res2 + "<br>")
function total(start_num, end_num){
    var sum = 0;
    for(var i = start_num; i <= end_num; i++){
        sum += i;
    }
    return sum;
}

// 함수의 4가지 형태
// 1. 입력x 출력x: 출력 or 함수 내에서 데이터를 만들어 함수 내에서만 쓸 때
function func1(){
    document.write("매개변수도 반환도 없음.");
}
// 2. 입력o 출력x
function func2(birth){
    var age = 2022 - parseInt(birth.subString(0, 4));
    document.write("나이: " + age + "세");
}
// 3. 입력x 출력o: 이벤트에 따른 동작을 설정하는 함수로 많이 쓰이는 형태
function func3(){
    var num = document.querySelector("#number");
    num = parseInt(num);
    
    return num + "번 입니다.";
}
// 4. 입력o 출력o
function func4(point, multi, state){
    if(state > 0) multi = 1;
    return (point * multi);
}
*/

var number = 0;
var oldnumber = 0;
var opd = null;
var result = 0;
var flag = false;

window.onload = function(){
    var num = document.querySelectorAll(".num");
    var op = document.querySelectorAll(".op");

    for(var i = 0; i < num.length; i++){
        num[i].addEventListener("click", function(){
            number = parseInt(this.dataset.value);
            calc();
        });
    }

    for(var i = 0; i < op.length; i++){
        op[i].addEventListener("click", function(){
            opd = this.dataset.value;
            flag = true;
            calc();
        });
    }
};

function calc(){
    if(flag){
        oldnumber = number;
        flag = false;
        number = 0;
    }
    if(oldnumber != 0 && number != 0){
        seletop();
        document.querySelector("#result").innerHTML = result;
    }

    alert(oldnumber + " " + opd + " " + number);
}

function seletop(){
    switch(opd){
        case "+":
            result = oldnumber + number;
            break;
        case "-":
            result = oldnumber - number;
            break;
        case "*":
            result = oldnumber * number;
            break;
        case "/":
            result = oldnumber / number;
            break;
    }
}