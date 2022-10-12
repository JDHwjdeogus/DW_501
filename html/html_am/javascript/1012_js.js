window.onload = function(){
    var btn = document.querySelector("#button1");
    btn.addEventListener("click", input);
};

function input(){
    var birth = document.querySelector("#birth").value;

    var birthYear = getYear(birth);
    var birthMonth = getMonth(birth);
    var birthAge = getAge(birth);

    var birthInfo = document.querySelectorAll(".birthInfo");
    birthInfo[0].innerHTML = "생년: " + birthYear;
    birthInfo[1].innerHTML = "생월: " + birthMonth;
    birthInfo[2].innerHTML = "나이(한국): " + birthAge;
}
function getYear(birth){
    var year = birth.split(".")[0];
    return year;
}
function getMonth(birth){
    var month = birth.split(".")[1];
    return month;
}
function getAge(birth){
    var today = new Date();
    var todayYear = today.getFullYear();

    var age =  parseInt(todayYear) - birth.split(".")[0];
    return age + 1;
}