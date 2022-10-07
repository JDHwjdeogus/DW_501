var obj = new Array();

window.onload = function(){
    for(var i = 0; i < 3;){
        var tmp = Math.floor(Math.random() * 9) + 1;
        if(obj.indexOf(tmp) == -1){
            obj.push(tmp);
            i++;
        }
    }
    console.log("random: " + obj);

    var bt = document.querySelector("#send");
    bt.addEventListener("click", number_input);
};

function number_input(){
    var user = new Array();
    var num = document.querySelectorAll(".num");

    user.push(parseInt(num[0].value));
    user.push(parseInt(num[1].value));
    user.push(parseInt(num[2].value));

    for(var i in num) num[i].value = "";

    console.log("user: " + user);
    console.log("num: " + num);

    num[0].focus();
    if(input_check(user)){
        alert("잘못된 숫자 입력입니다. 중복없이 1 ~ 9 중에서 입력하세요");
        return;
    }
    number_check(user);
}

function input_check(user){
    for(var i in user){
        if(user[i] < 1 || user[i] > 20) return true;
        if(user[0] == user[1] || user[0] == user[1] || user[0] == user[1]) return true;
        
        return false;
    }
}

function number_check(user){
    var strike = 0;
    var ball = 0;

    if(user[0] == obj[0]) strike++;
    if(user[1] == obj[1]) strike++;
    if(user[2] == obj[2]) strike++;

    if(user[0] == obj[1] || user[0] == obj[2]) ball++;
    if(user[1] == obj[0] || user[1] == obj[2]) ball++;
    if(user[2] == obj[0] || user[2] == obj[1]) ball++;

    print(strike, ball, user);
}

function print(strike, ball, user){
    var res = document.querySelector("#result");
    var div = document.createElement("div");
    var out = 3 - (strike + ball);
    div.appendChild(document.createTextNode(user + " : " + strike + "개 스트라이크, " + ball + "개 볼, " + out + "개 아웃"));
    res.prepend(div);
}