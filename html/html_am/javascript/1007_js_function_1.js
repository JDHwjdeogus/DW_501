function score_input(){
    var kor = 99;
    var mat = 89;
    var eng = 79;
    // 총점과 평균 구하기
    total(kor, mat, eng);

    return [kor, mat, eng];
    // return은 반환값 하나만 가능
}

function total(kor, mat, eng){ // 총점 계산
    var tot = kor + mat + eng;
    avg(tot);
}

function avg(tot){ // 평균 계산
    var res = tot / 3;
    result_print(res);
}

function result_print(res){ //결과 출력
    document.write("평균: " + res);
}