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
            if(board[i * 20 + j] == 1){
                table += '<td><img src="../img/bomb.png"></td>';
            } else{
                table += '<td></td>';
            }
        }
        table += "</tr>";
    }
    document.getElementById("wrap").innerHTML = table;
};