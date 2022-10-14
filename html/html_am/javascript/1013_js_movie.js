// focus(), click이 빠졌을 때 즉 커서가 떠날 때(blur)
function movie(title, dir, year,genre){ // 생성자 함수
    this.movie_title = title;
    this.movie_dir = dir;
    this.movie_year= year;
    this.movie_genre = genre;
}
movie.prototype.out = function(){
    return this.movie_title + " " + this.movie_dir + " " + this.movie_year + " " + this.movie_genre;
}
var movie_list = new Array(); // movie 객체가 저장될 배열

window.onload = function(){
    var input = document.getElementsByClassName("movie");

    for(var i in input){
        input[i].addEventListener("focus", function(){
            this.classList.add("active");
        });
        input[i].addEventListener("blur", function(){ 
            if(this.val() == ''){
                this.classList.remove("active");
            }
        });
    }
};

function enroll(){
    var val_temp = document.getElementsByClassName("movie");
    var data = new movie(val_temp[0].value, val_temp[1].value, val_temp[2].value, val_temp[3].value);
    movie_list.push(data);
    print();
}

function print(){
    var li = document.createElement("li");
    li.innerText = movie_list[movie_list.length - 1].out();

    document.getElementById("movie_list").append(li);
}

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

// var obj = new Object();

/*
    ex) 도형 객체
    도형.모양 = 원;
    도형.위치x축 = 150;
    도형.위치y축 = 50;
    도형.그리기(함수);
    도형.지우기(함수);

    객체의 멤버로 접근하기 위한 연산자 (.) - access연산자 접근연산자
    접근 연산자는 산술 및 비교 연산자들 보다도 우선순위가 높음.
    ex) 도형.위치x축 + 10; - 도형.위치x축 >> + 10
    
    연산자 우선순위
    1. ()
    2. []
    3. ->

*/
    
/*
    // 객체 생성방법
    // 1. 객체 리터럴 방식: 변수처럼 객체를 생성하는 방식
    var shape = {
        // key는 반드시 문자열로 지정 및 삽입이 가능하다.
        모양: "원", x축: 150, y축: 50,
        draw: function(){ // shape 객체의 key
            return "x축 :  " + this.x축 + " | y축 :  " + this.y축 + "위치에 " + this.모양 + "그리기. "
        }
    };
    // 객체 내부에서 함수 생성 시 변수(key)의 사용은 this로 접근
    // 객체 값 출력 -> 객체.key (shape.모양)
    document.write("모양 :  " + shape.모양 + "<br>");
    document.write(shape.draw());

    // 학생 객체 생성
    // var name = "idden";
    var student = {
        학년: 1, 반: 3, 번호: 30, 이름: "idden", 
        // 변수 이름의 중간에 가로줄이 생기는 ui: 사용할 순 있지만 매우 권장하지 않는다는 뜻.
    };
    // 유의: 함수를 객체 밖에서 생성하는 것보단 내부에서 생성하는 것이 개발하는 데 있어 더 편리하다.
    // document.write("<br>" + name);
    document.write("<br>" + student.이름 + "<br>");


    // 2. 생성자 방식: 2-1. Object 객체로 생성 | 2-2. 함수를 통한 생성
    // 객체(object)를 생성(객체 안에 키와 밸류가 없는 상태로 객체만을 생성)
    var music = new Object(); 
    // key와 value를 생성
    music.title = "라이언"; 
    music["아티스트"] = "여자아이들";
    music.link = '<iframe width="894" height="503" src="https://www.youtube.com/embed/6oanIo_2Z4Q" title="(여자)아이들((G)I-DLE) - "LION" Official Music Video" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>';
    // music.link = "https://youtu.be/6oanIo_2Z4Q";
    // document.write("<br>" + "<a href='" + music.link + "'>" + music["title"] + " " + music.아티스트 + "</a>");
    document.write("<br>" + "<a href='javascript:open();'>" + music["title"] + " " + music.아티스트 + "</a>");
    function open(){
        document.getElementById("play").innerHTML = music.link;
    }

    var 제목 = "안녕";
    var 아티스트 = "폴킴";
    var 링크 = '<iframe width="894" height="503" src="https://www.youtube.com/embed/UidhQTm1ulw" title="폴킴 - 안녕 (호텔 델루나 OST PART.10) / 가사" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>'
    music.title = 제목;
    music.아티스트 = 아티스트;
    music.링크 = 링크;
    document.write("<br>" + "<a href='javascript:open1();'>" + music["title"] + " " + music.아티스트 + "</a>");
    function open1(){
        document.getElementById("play").innerHTML = music.링크;
    }
*/

    // function movie(제목, 감독, 년도, 장르){
    //     this.영화제목 = 제목;
    //     this.영화감독 = 감독;
    //     this.개봉년도 = 년도;
    //     this.영화장르 = 장르;
    //     // this.view = function(){
    //     //     return this.영화제목 + ": " + this.영화감독;
    //     // }
    // }
    // // 객체를 만드는 이유: 변수와 함수를 묶어서 사용하기 위함
    // // 즉, 메모리 최적화를 위해 함수를 따로 외부에서 선언해 사용하면 객체를 만드는 의의가 없다.
    // // 위의 두 딜레마를 동시에 잡는 이 방법은 자바스크립트의 핵심: 프로토타입
    // // 자바스크립트 내 모든 객체는 프로토타입을 갖는다.
    
    // movie.prototype.view = function(){
    //     return this.영화제목 + ": " + this.영화감독;
    // }; 
    // // 따로 만드는 게 아닌, 자바스크립트 라이브러리 안에 이미 내장되어있는 객체 Number.
    // // 보통 객체는 객체 안에 존재하는 지정된 함수만 사용해야 하며, 굳이 다른 함수를 사용하려면 따로 정의해줘야 하는데, 자바스크립트는 prototype 함수 추가만 해주면 된다.

    // var m1 = new movie("한산", "김한민", "2022", "역사");
    // document.write(m1.영화제목 + "<br>");
    // var m2 = new movie("공조2", "이석훈", "2022", "액션");
    // document.write(m2.view());