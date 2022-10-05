// addEventListener: 태그에 이벤트를 설정하는 함수
// addEventListener 함수 활용 방법: addEventListener("이벤트", 이벤트 발생 시 동작할 함수)
// 이 때 동작할 함수를 작성하는 칸에 직접 함수를 만들어도 좋고 만들어둔 함수의 이름을 추가해주는 것도 좋다.
// this를 사용해 엘리먼트를 제어할 수 있음.

window.onload = function(){
    var add = document.querySelector("#add");
    add.addEventListener("click", tag_add);
};
// tag_add 함수의 동작: input 태그들에 대한 입력 완료 후 등록(enroll함수)를 작동시키기 전까지
var add_check = false;

function tag_add(){
    if(add_check){return;}
    add_check = true;

    var Pdiv = document.querySelector("#score_wrap");

    var div = document.createElement("div");

    var ipt = document.createElement("input");
    ipt.setAttribute("type", "text");
    ipt.setAttribute("id", "name");
    ipt.setAttribute("placeholder", "이름");
    div.appendChild(ipt);

    var course = [ ["국어", "kor"], ["수학", "mat"], ["영어", "eng"] ];
    for(let i = 0; i < 3; i++){
        ipt = document.createElement("input");
        ipt.setAttribute("type", "number");
        ipt.setAttribute("id", course[i][1]);
        // kor, mat, eng가 ipt의 id가 됨.
        ipt.setAttribute("placeholder", course[i][0]);
        div.appendChild(ipt);
    }

    var bt = document.createElement("button");
    bt.addEventListener("click", enroll);
    var text = document.createTextNode("등록");
    bt.appendChild(text);
    bt.setAttribute("class", "bt");
    // setAttribute: 태그 내부, 꺽쇠 안에 속성을 설정하는 역할이므로 버튼 등에 글씨를 넣어줄 순 없음.
    // 이 때 사용하는 함수: document.createTextNode("text");
    div.appendChild(bt);

    // score_wrap div에 추가
    // input 태그들을 새로 만들어준 div에 넣기
    Pdiv.appendChild(div);

}

function enroll(){
    add_check = false;

    var name = document.querySelector("#name").value;
    var kor = document.querySelector("#kor").value;
    var mat = document.querySelector("#mat").value;
    var eng = document.querySelector("#eng").value;

    var Pdiv = document.querySelector("#score_wrap");

    //div #score_wrap에 추가할 작업
    var div = document.createElement("div");
    div.setAttribute("class", "score");
    var data = [name, kor, mat, eng];
    // input 태그에 입력된 값을 h3 태그에 삽입
    for(let i in data){
        let h = document.createElement("h3");
        let text = document.createTextNode(data[i]);
        h.appendChild(text);
        div.appendChild(h);
    }
    var input = Pdiv.lastChild;
    // input 태그 제거
    Pdiv.removeChild(input);

    // input 태그값 div에 삽입
    Pdiv.appendChild(div);
}