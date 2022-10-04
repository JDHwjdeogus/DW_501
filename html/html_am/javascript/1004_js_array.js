// window.onload: html문서의 모든 내용이 실행된 이후에 해당 부분을 실행하는 함수
// window 객체: 브라우저 실행을 위한 프로그램 틀
// window에만 onload가 존재하는 것은 아니다. html을 포함한 모든 객체에도 존재한다.
// load: 불러오기. onload: 불러오기가 끝났을 때 동작.

/*
var item_list = ["핸드폰거치대", "급속충전기", "c타입케이블", "강화유리필름", "고리형 그립톡", "폰케이스"]
window.onload = function () {
    var li = document.getElementsByClassName("item");
    // var li = documents.querySelectorAll(".item");
    // class는 복수의 태그에 지정이 가능하므로 Element"s", Selector"All"로 작성된다.
    
    // for(var i = 0; i < li.length; i++)
    for(var i in li) { // 배열 구조 안에서만 사용 가능한 반복문
        li[i].innerHTML = item_list[i];
    }
}
*/

var item = new Array();
function enroll() {
    // var name = document.getElementById("item_name");
    var name = document.querySelector("#item_name");
    
    var prop = name.value;
    item.push(prop);

    // var html = "<li>" + prop + "</li>";
    // 해당 코드는 text만 생성한 것이지 태그를 만든 게 아님
    
    var price = document.querySelector("#item_price");
    var ul = document.querySelector("#item_list");
    var li = document.createElement("li");  // li 태그 생성
    li.innerHTML = item[item.length - 1];   // li 태그 내 삽입

    var b = document.createElement("b");
    b.innerHTML = " " + price.value + "원 ";
    li.appendChild(b);

    // 삭제 버튼 정의
    var bt = document.createElement("button");
    bt.setAttribute("class", "del_bt");
    bt.setAttribute("onclick", "del(this)");
    bt.innerHTML = "삭제";
    // li 태그의 자식으로 정의한 버튼을 추가
    li.appendChild(bt);

    ul.appendChild(li);  // ul 태그 자식으로 li 추가
}

/*
    태그 내부의 (기존에 존재하던 내용을 지우고) 새로운 내용으로 삽입하는 방법: innerHTML 'attribute'(ex. id, class, name, ...)
    태그 내부에 새로운 내용을 추가하는 방법: appendChild 'function'
    태그 내부에 텍스트 형식으로 삽입하는 방법: appendChild(textnode)

    node란?
    body >> div >> ..input ..button || >> div (자세한 구조는 연결된 html 파일 참고)
    이런 구조를 트리 구조라고 하는데, 이 때 태그 하나 하나를 node라고 부른다.

    새로운 태그(elements, 요소, 객체, ... 라고도 부른다)를 만드는 방법: createElement() 함수
    js: 객체 or 엘리먼트, css: 엘리먼트, html: 태그
*/

function del(obj) {
    // alert(obj.parentNode);  // [object HTMLLIElement]: 버튼 태그의 부모는 html의 li 엘리먼트
    var parent_li = obj.parentNode;
    // alert(parent_li.parentNode);  // [object HTMLUListElement]
    var parent_ul = parent_li.parentNode;
    parent_ul.removeChild(parent_li);
}

/*
    document.createElement: 새 태그 생성
    ex. document.createElement("div");    >> div 생성

    appendChild: 자식 태그로 추가
    ex. p = document.createElement("p");
        body.appendChild(p);    >> body에 p 태그 추가
    
    setAttribute: 태그에 새 속성 추가
    ex. p.setAttribute("id", "ppp");    >> 해당 태그(p)에 id = "ppp" 삽입

    removeChild: 자식 태그 삭제
    ex. body.removeChild(p);    >> body 태그에서 해당 태그를 제거
*/