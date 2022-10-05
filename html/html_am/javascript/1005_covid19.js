var num = 1;

window.onload = function(){
    document.querySelector("#add").addEventListener("click", function(){
        var city = document.querySelector("#city").value;
        var people = document.querySelector("#people").value;

        var div = document.createElement("div");
        
        var h = document.createElement("h3");
        h.appendChild(document.createTextNode(num++));
        div.appendChild(h);

        document.createElement("h3");
        h.appendChild(document.createTextNode(city));
        div.appendChild(h);

        document.createElement("h3");
        h.appendChild(document.createTextNode(people + "명"));
        div.appendChild(h);

        var parent = document.querySelector("#population_wrap")
        parent.prepend(div); // 제일 먼저 들어온 태그를 맨 앞으로 넘김
    });
};

// function tag_add(){
//     var Pdiv = document.querySelector("#population_wrap");

//     var div = document.createElement("div");

//     var ipt = document.createElement("input");
//     ipt.setAttribute("type", "text");
//     ipt.setAttribute("id", "name");
//     ipt.setAttribute("placeholder", "이름");
//     div.appendChild(ipt);

//     var course = [ ["국어", "kor"], ["수학", "mat"], ["영어", "eng"] ];
//     for(let i = 0; i < 3; i++){
//         ipt = document.createElement("input");
//         ipt.setAttribute("type", "number");
//         ipt.setAttribute("id", course[i][1]);
//         ipt.setAttribute("placeholder", course[i][0]);
//         div.appendChild(ipt);
//     }
//     Pdiv.appendChild(div);
// }

// function enroll(){
//     var name = document.querySelector("#name").value;
//     var kor = document.querySelector("#kor").value;
//     var mat = document.querySelector("#mat").value;
//     var eng = document.querySelector("#eng").value;

//     var Pdiv = document.querySelector("#score_wrap");

//     var div = document.createElement("div");
//     div.setAttribute("class", "score");
//     var data = [name, kor, mat, eng];
//     for(let i in data){
//         let h = document.createElement("h3");
//         let text = document.createTextNode(data[i]);
//         h.appendChild(text);
//         div.appendChild(h);
//     }
//     var input = Pdiv.lastChild;
//     Pdiv.removeChild(input);

//     Pdiv.appendChild(div);
// }