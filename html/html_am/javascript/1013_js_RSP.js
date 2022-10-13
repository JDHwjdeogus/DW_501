// 실행부
userInput();
// 정의부
function userInput(){
    var user = parseInt(prompt("1. 가위 2. 바위 3.보"));
    var cpu = cpuInput();
    result(user, cpu);
}

function cpuInput(){
    var cpu = Math.floor(Math.random() * 3) + 1;
    return cpu;
}

function result(user, cpu){
    if(user == cpu) alert("Draw");
    else if((user==1 && cpu==3)||(user==1 && cpu==3)||(user==1 && cpu==3)) alert("Win");
    else alert("Lose");
}