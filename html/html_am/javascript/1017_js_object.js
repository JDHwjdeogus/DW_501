function tb(row, col, wdt, hgt){
    this.row = row;
    this.col = col;
    this.wdt = wdt;
    this.hgt = hgt;
}
var tbArray = new Array();

var bt_cnt = 0;
var bt_check = false; // 메세지를 띄우는 경우와 안띄우는 경우를 판가름

window.onload = function(){
    document.querySelector("#add").addEventListener("click", btAdd);

    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        T_put[i].addEventListener("keyup", function(){
            if(!bt_check){ // 버튼 추가되기 전까지 bt_check = false. 버튼 추가 시 true;
                alert("새 세팅 버튼을 추가.");
                this.value = ""; // 값이 누적되지 않음. 입력한 값이 지워짐.
            }
        });
    }
}

function btAdd(){
    var bt = document.createElement("button");
    bt.appendChild(document.createTextNode("세팅" + (++bt_cnt)));
    bt.setAttribute("data-value","0"); // 여기서 value는 변수와 같은 역할이므로 무슨 이름을 주든 상관이 없다.

    bt.addEventListener("click", function(){
        if(this.dataset.value == 0) value_save(this);
        else table_draw(this);
    });

    var addBtnResult = document.getElementsByClassName("addBtnResult");
    addBtnResult[0].appendChild(bt);
    
    bt_check = true;
}

function table_draw(obj){
    var draw = document.querySelector("#draw");
    var data = tbArray[parseInt(obj.dataset.value) - 1];
    draw.innerHTML = data.row + " " + data.col + " " + data.wdt + " " + data.hgt;
}

function value_save(obj){
    var input_label = ["행", "열", "너비", "높이"];
    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        if(T_put[i].value = ""){
            alert(input_label[i] + "을 입력하세요");
            T_put[i].focus();
            return;
        }
    }

    var temp = new tb(T_put[0].value, T_put[1].value, T_put[2].value, T_put[3].value);
    tbArray.push(temp);
    console.log(tbArray);
    obj.dataset.value = bt_cnt;

    bt_check = false;
    for(var i = 0; i <T_put.length; i++){
        T_put[i].value = "";
    }
}












// function tb(col,row, wd, hg){
//     this.col=col;
//     this.row=row;
//     this.width=wd;
//     this.height=hg;
// }

// var tb_list = new Array();
// var bt_cnt=0;
// var bt_check=false;

// window.onload=function(){
//     var add_bt = document.querySelector("#add");
//     add_bt.addEventListener("click",add_button);

//     var T_put =document.getElementsByClassName("T_put");
//     for(var i in T_put){
//         T_put[i].addEventListener("keyup",function(){
//             if( !bt_check ){
//                 alert("새 세팅버튼을 추가하세요");
//                 this.value='';
//             }
//         });
//     }
// };

// function add_button(){
//     var bt = document.createElement("button");
//     bt.appendChild(document.createTextNode("세팅"+(++bt_cnt)));
//     bt.setAttribute("data-value","0");

//     bt.addEventListener("click",function(){
//         if( this.dataset.value== 0) //input 값 저장 하기전
//             value_save(this);
//         else  // input 값 저장 이후
//             table_draw(this);
//     });
//     document.getElementsByClassName("add_wrap")[0].appendChild(bt);
//     bt_check=true;
// }

// function table_draw(obj){
//     var draw = document.querySelector("#draw");

//     var data = tb_list[parseInt(obj.dataset.value)-1];

//     draw.innerHTML = data.col+" "+data.row+" "+data.width+" "+data.height;
// }

// function value_save(obj){
//     var input_label=["행","열","너비","높이"];
//     var T_put = document.getElementsByClassName("T_put");
//     for(var i in T_put){
//         if(T_put[i].value==''){
//             alert(input_label[i] +" 을 입력하세요");
//             T_put[i].focus();
//             return;
//         }
//     }

//     var temp = new tb(T_put[0].value, T_put[1].value,T_put[2].value,
//         T_put[3].value);
//     tb_list.push(temp);

//     obj.dataset.value=bt_cnt;

//     bt_check=false;
//     for(var i=0; i<T_put.length; i++){
//         T_put[i].value='';
//     }
    
// }