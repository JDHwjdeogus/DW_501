var board = new Array(400);
board.fill(0);

// 폭탄 위치
for(var i = 0; i < 200; ){
    let pos = Math.floor(Math.random() * 400);
    if(board[pos] != 1){
        board[pos] = 1;
        i++;
    }
}

window.onload = function(){
    var table = "<table>";
    for(var i = 0; i < 20; i++){
        table += "<tr>"
        for(var j = 0; j < 20; j++){
            table += '<td class = "bm" data-idx = ' + (i * 20 + j) + '></td>';
        }
        table += "</tr>";
    }
    document.getElementById("wrap").innerHTML = table;

    var bm = document.getElementsByClassName("bm"); // board 배열과 같은 크기의 배열로 태그를 가져오게 된다.
    // bm[0].style.background = "red";

    for(var i in bm){
        bm[i].addEventListener('click', function(){
            let n = this.dataset.idx;
            //동작할 함수를 작성. 혹은 기존의 함수를 추가
            if(board[n] == 1) {
                this.innerHTML = "<img src='../img/bomb.png'>"
                this.style.background = 'red'
                alert("bomb");
            }
            else this.style.background = "rgb(230, 230, 230)" ;
        });
            // addEventListener: 이벤트를 추가
    }
};