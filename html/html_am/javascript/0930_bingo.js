var bingo = new Array();
while(bingo.length != 25){
    let num = Math.floor(Math.random() * 100) + 1;
    if(bingo.indexOf(num) == -1){
        bingo.push(num)
    }
}

window.onload = function(){
    var td = document.querySelectorAll(".box");

    for(var i = 0; i < td.length; i++){
        td[i].innerHTML = bingo[i];
        td[i].addEventListener('click', function(){
            this.style.background = "#e5cd99";
            check(this.innerHTML);
        });
    }
};

function check(n){
    //체크한 숫자를 빙고 배열에서 제외시키기
    for(let i in bingo) {
        if(bingo[i] == n){
            bingo[i] = 0;
            break;
        }
    }

    var wd = 0, hg = 0, cr1 = 0, cr2 = 0, end = 0;
    for(var i = 0; i < 5; i++){
        for(var k = 0; k < 5; k++){
            // 줄의 0 개수 판별
            // 5줄 빙고 여부 확인(가로)
            if(bingo[i * 5 + k] == 0) wd++; 
            // 5줄 빙고 여부 확인(세로)
            if(bingo[k * 5 + i] == 0) hg++; 
        }

        if(bingo[i * 6] == 0) cr1++; // 왼쪽 위 대각선
        if(bingo[(i + 1) * 4] == 0) cr2++;
        
        if(wd == 5) end++;
        if(hg == 5) end++;
        if(cr1 == 5) end++;
        if(cr2 == 5) end++; 
        // 첫 줄 끝나고 다음 줄의 빙고 여부를 확인하기 위해 wd 변수를 초기화
        wd = 0; 
        hg = 0;
    }
    if(end == 5) alert("bingo");
}