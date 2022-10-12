window.onload = function(){
    var btn = document.getElementById("btn");
    btn.addEventListener("click", input);
};

function input(){
    var ipt1 = document.getElementById("ipt1").value;
    var ipt2 = document.getElementById("ipt2").value;
    list_push(ipt1, ipt2);

    // input 값 초기화
    // ipt1 = "";
    // ipt2 = "";
    // input(ipt1)에 커서 이동
    // ipt1.focus();
}

var list = new Array();
function list_push(ipt1, ipt2){
    list.push(ipt1);
    list.push(ipt2);
    // list.push([ipt1, ipt2]);
    // list.push({i1: ipt1, i2: ipt2});
    
    // var out = "<span>" + ipt1 + "</span><span>" + ipt2 + "</span><br>";
    // list.push(out);
    
    console.log(list);
    output_list();
}

function output_list(){
    var output = document.getElementById("output");
    
    var name = document.createElement("div");
    name.setAttribute("id", "name");
    output.appendChild(name);

    var job = document.createElement("div");
    job.setAttribute("id", "job");
    output.appendChild(job);

    name.innerHTML = list[0];
    job.innerHTML = list[1];

    // var out = "";
    // for(var i in list){
        // out += list[i];
    // }
    // output.innerHTML = out;
}